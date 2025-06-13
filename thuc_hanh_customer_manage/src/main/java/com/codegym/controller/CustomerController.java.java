package com.codegym.controller;

import com.codegym.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/customers")
    public ModelAndView showList() {
        ModelAndView modelAndView = new ModelAndView("customers/list.jsp");
        modelAndView.addObject("customers", customerService.findAll());
        return modelAndView;
    }

    @GetMapping("/customers/info")
    public ModelAndView showInfo(@RequestParam int id) {
        ModelAndView modelAndView = new ModelAndView("customers/info.jsp");
        modelAndView.addObject("customer", customerService.findById(id));
        return modelAndView;
    }
}
