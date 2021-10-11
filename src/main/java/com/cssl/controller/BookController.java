package com.cssl.controller;

import com.cssl.pojo.BookManager;
import com.cssl.service.BookManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BookController {

    @Autowired
    private BookManagerService bookManagerService;

    //查询所有
    @RequestMapping("/list")
    public ModelAndView list(ModelAndView mv){
        mv.addObject("list",bookManagerService.showAll());
        mv.setViewName("list");
        return mv;
    }

    //删除指定书籍信息
    @RequestMapping("/del")
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
    @RequestMapping("/findById")
    public ModelAndView showOne(ModelAndView mv,Integer id){
        BookManager bookManager = bookManagerService.findById(id);
        mv.addObject("book",bookManager);
        mv.setViewName("update");
        return mv;
    }

    //修改书籍信息
    @RequestMapping("/save")
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
        @RequestMapping("/add")
        public String addBook(ModelAndView mv,BookManager bookManager) {
            int num = bookManagerService.addBookManager(bookManager);
            if (num > 0) {
                return "redirect:/list";
            }else{
                return "redirect:/list";
            }


        }
}
