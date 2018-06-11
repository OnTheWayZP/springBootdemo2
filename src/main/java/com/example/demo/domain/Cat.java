package com.example.demo.domain;

import com.alibaba.fastjson.annotation.JSONField;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by zhangpeng on 2018/6/8.
 * 1.使用@Entity进行持久化操作，当JPA检测到我们实体类有@Entity注解的时候会在我们数据库中生成对应的表格信息。
 * 2.如何指定主键及主键生成策略
 * 使用@Id指定主键
 */
@Entity
public class Cat {
    /**
     * 使用@Id指定主键
     *使用@GeneratedValue(strategy = GenerationType.AUTO)指定主键生成策略，mysql默认自增长
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  int id;
    private String name;
    private int age;
    @JSONField(format = "YYYY-MM-dd HH:mm:ss")
    private Date createTime;//创建时间

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
