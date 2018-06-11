package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Created by zhangpeng on 2018/6/10.
 */
@RequestMapping("/templates")
@Controller
public class TemplatesController {
    /**
     * 映射地址是/templates/hello
     * @return
     */
    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }

    @RequestMapping("/hello2")
    public String hello2(Map<String,Object> map){
        map.put("name","Andy");
        return "hello";
    }

    @RequestMapping("/helloFtl")
    public String helloFtl(){
        return "helloFtl";
    }

    @RequestMapping("/index")
    public String index(){
        return "index";
    }

}
