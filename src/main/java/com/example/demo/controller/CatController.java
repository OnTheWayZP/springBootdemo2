package com.example.demo.controller;

import com.example.demo.domain.Cat;
import com.example.demo.service.CatService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by zhangpeng on 2018/6/8.
 */
@RestController
@RequestMapping("/cat")
public class CatController {
    @Resource
    private CatService catService;

    @RequestMapping("/save")
    public String save(){
        Cat cat = new Cat();
        cat.setAge(5);
        cat.setName("jack");
        catService.save(cat);
        return "save OK!";
    }

    @RequestMapping("/delete")
    public String delete(){
        catService.delete(1);
        return "delete OK!";
    }

    @RequestMapping("/getAll")
    public Iterable<Cat> getAll(){
        return catService.getAll();
    }

    @RequestMapping("/findByName")
    public Cat findByName(String name){
        return catService.findByName(name);
    }

    @RequestMapping("/findByName2")
    public Cat findByName2(String name){
        return catService.findByName2(name);
    }

    @RequestMapping("/findByName3")
    public Cat findByName3(String name){
        return catService.findByName3(name);
    }


}
