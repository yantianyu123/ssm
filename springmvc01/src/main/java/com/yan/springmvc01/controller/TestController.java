package com.yan.springmvc01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author
 * @date 2020/6/27 18:48
 */
@Controller
public class TestController {
    
    @RequestMapping("/index")
    public String index(String name){
        System.out.println("success");
        return "index";
    }
}
