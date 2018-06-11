package com.example.demo.dao;

import com.example.demo.domain.Cat;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * Created by zhangpeng on 2018/6/9.
 */
@Repository
public class CatDao {

    @Resource
    private JdbcTemplate jdbcTemplate;

    public Cat selectByCatName(String name){
        /**
         * 1.定义一个sql
         * 2.定义一个RowMapper
         * 执行查询方法
         */
        String sql = "select * from cat where name = ?";
        RowMapper<Cat> rowMapper = new BeanPropertyRowMapper<>(Cat.class);
        Cat cat = jdbcTemplate.queryForObject(sql,new Object[]{name}, rowMapper);
        return cat;
    }
}
