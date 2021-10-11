package com.cssl.controller;

import com.cssl.service.BookManagerService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BookController {

    private BookManagerService bookManagerService;

    //查询所有
    @RequestMapping("/list")
    public ModelAndView list(ModelAndView mv){
        mv.addObject("list",bookManagerService.showAll());
        mv.setViewName("list");
        return mv;
    }


}
