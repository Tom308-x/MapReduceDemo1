package com.cssl.controller;

import com.cssl.pojo.BookManager;
import com.cssl.service.BookManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import io.swagger.annotations.*;

@Controller
@Api(value = "提供书籍信息增删改查功能的接口",tags = "书籍管理")
public class BookController {

    @Autowired
    private BookManagerService bookManagerService;

    //查询所有
    @ApiOperation("显示所有书籍信息接口")
    @GetMapping("/list")
    public ModelAndView list(ModelAndView mv){
        mv.addObject("list",bookManagerService.showAll());
        mv.setViewName("list");
        return mv;
    }

    //删除指定书籍信息
    @ApiOperation("删除指定书籍接口")
    @DeleteMapping("/del")
    public String del(ModelAndView mv,Integer id){
        int i = bookManagerService.deleteBookManager(id);
        if (i>0){
            return "redirect:/list";
        }else{
            mv.addObject("mess","删除失败");
            return "forward:/list";
        }
    }

    //查询指定id的书籍信息
    @ApiOperation("显示指定书籍信息接口")
    @GetMapping("/findById")
    public ModelAndView showOne(ModelAndView mv,Integer id){
        BookManager bookManager = bookManagerService.findById(id);
        mv.addObject("book",bookManager);
        mv.setViewName("update");
        return mv;
    }

    //修改书籍信息
    @ApiOperation("修改指定书籍信息接口")
    @PutMapping("/save")
    public  String saveBook(ModelAndView mv,BookManager bookManager) {
        int i = bookManagerService.updateBookManager(bookManager);
        if (i > 0) {
            return "redirect:/list";
        } else {
            mv.addObject("mess", "修改失败");
            return "forward:/findById?id=" + bookManager.getId();
        }
    }
    // 新增书籍
    @ApiOperation("新增书籍信息接口")
        @PostMapping("/add")
        public String addBook(ModelAndView mv,BookManager bookManager) {
            int num = bookManagerService.addBookManager(bookManager);
            if (num > 0) {
                return "redirect:/list";
            }else{
                return "redirect:/list";
            }


        }
}
