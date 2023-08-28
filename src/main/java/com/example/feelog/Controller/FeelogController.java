package com.example.feelog.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class FeelogController {
    @RequestMapping({"/","/index"})
    public ModelAndView index(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("index.html");
        return mv;
    }
    @RequestMapping("/contact")
    public ModelAndView contact(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("contact.html");
        return mv;
    }


}