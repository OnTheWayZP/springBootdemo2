package com.example.demo;

import com.example.demo.domain.Demo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by zhangpeng on 2018/6/7.
 */

/**
 * @RestController等价于@Controller和@requestBody
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello Controller";
    }
    @RequestMapping("/hello2")
    public String hello2(){
        return "hello2";
    }

    //Spring Boot默认使用的json解析框架是jackson
    @RequestMapping("/demo")
    public Demo getDemo(){
        Demo demo = new Demo();
        demo.setId(2);
        demo.setName("zapoul");
        demo.setCreateTime(new Date());
        return  demo;
    }
}
