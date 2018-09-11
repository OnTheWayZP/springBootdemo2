package com.example.demo.service;

import com.example.demo.domain.Demo;
import com.example.demo.dao.DemoMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by zhangpeng on 2018/6/11.
 */
@Service
public class DemoService {
    @Resource
    private DemoMapper demoMapper;

    public List<Demo> likeName(String name){
        return demoMapper.likeName(name);
    }

    public List<Demo> getAll(){
        return demoMapper.getAll();
    }

    @Transactional
    public Demo save(Demo demo){
        demoMapper.save(demo);
        return demo;
    }
}
