package com.example.demo.dao;

import com.example.demo.domain.Demo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by zhangpeng on 2018/6/11.
 */
@Repository
public interface DemoMapper {
    @Select("select * from demo where name = #{name}")
    public List<Demo> likeName(String name);

    @Select("select * from demo")
    public List<Demo> getAll();

    @Insert("insert into demo(id,name) values(#{id},#{name})")
    @Options(useGeneratedKeys = true,keyProperty = "id",keyColumn = "id")
    public Demo save(Demo demo);
}
