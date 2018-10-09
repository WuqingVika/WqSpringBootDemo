package com.wq.bootlearn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by qwu on 2018/10/9.
 */
@Controller
public class HelloController {
    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return "Hello world!";
    }
}
