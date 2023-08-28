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
    public ModelAndView contactForm(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("contact.html");
        return mv;
    }
    @RequestMapping("/signup")
    public ModelAndView signupForm(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("sign-up.html");
        return mv;
    }
    @RequestMapping("/bloghome")
    public ModelAndView blogHome(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("blog-home.html");
        return mv;
    }
    @RequestMapping("/blogpost")
    public ModelAndView blogPost(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("blog-post.html");
        return mv;
    }



}