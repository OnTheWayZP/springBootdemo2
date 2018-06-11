package com.example.demo.service;

import com.example.demo.dao.CatDao;
import com.example.demo.domain.Cat;
import com.example.demo.repository.Cat2Repository;
import com.example.demo.repository.CatRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by zhangpeng on 2018/6/8.
 */
@Service
public class CatService {
    @Resource
    private CatRepository catRepository;
    @Resource
    private Cat2Repository cat2Repository;
    @Resource
    private CatDao catDao;
    /**
     * save,update,delete需要绑定事物
     * 使用
     */

    @Transactional
    public void save(Cat cat){
        catRepository.save(cat);
    }
    @Transactional
    public void delete(int id){
        catRepository.deleteById(id);
    }
    @Transactional
    public void update(Cat cat){

    }
    public Iterable<Cat> getAll(){
       return catRepository.findAll();
    }
    public Cat findByName(String name){
        return cat2Repository.findByName(name);
    }
    public Cat findByName2(String name){
        return cat2Repository.findMyName(name);
    }

    public Cat findByName3(String name){
        return catDao.selectByCatName(name);
    }

}
