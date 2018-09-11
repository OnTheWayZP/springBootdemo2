package com.example.demo.controller;

import com.example.demo.domain.Demo;
import com.example.demo.service.DemoService;
import com.github.pagehelper.PageHelper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by zhangpeng on 2018/6/11.
 */
@RestController
@RequestMapping("/demo2")
public class DemoController {
    @Resource
    private DemoService demoService;

    @RequestMapping("/likeName")
    public List<Demo> likeName(String name) {
        return demoService.likeName(name);
    }

    @RequestMapping("/getAll")
    public List<Demo> getAll() {
        /**
         * pageNum第几页，pageSize页中数据条数
         */
        PageHelper.startPage(1,2);
        return demoService.getAll();
    }
    @RequestMapping("/save")
    public Demo save(){
        Demo demo = new Demo();
        demo.setId(7);
        demo.setName("salin");
        return demoService.save(demo);
    }
}
