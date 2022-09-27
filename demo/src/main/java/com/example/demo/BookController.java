package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class BookController {
    // @GetMapping("/create")
    // public String test() {
    //     return "test!!";
    // }
    @RequestMapping(value="/create", method=RequestMethod.GET)
    public ModelAndView create(){
        return new ModelAndView("book/create");
    }
}