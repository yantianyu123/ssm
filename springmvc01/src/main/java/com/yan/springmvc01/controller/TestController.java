package com.yan.springmvc01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * @author
 * @date 2020/6/27 18:48
 */
@Controller
public class TestController {
    
    @RequestMapping("/index")
    public String index(@CookieValue(value = "JSESSIONID",required = false)String JSESSIONID){
        System.out.println("JSESSIONID=" + JSESSIONID);
        return "index";
    }
    
    @GetMapping("/get/{id}")
    public String getRequest(@PathVariable Integer id, Model model){
        System.out.println("GET==>id:" + id);
        model.addAttribute("result","我是result");
        return "success";
    }
    @PostMapping("/add")
    @ResponseBody
    public String postRequest(String name){
        System.out.println("POST==>name:" + name);
        return "aa";
    }
}
