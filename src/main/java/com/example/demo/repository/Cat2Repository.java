package com.example.demo.repository;

import com.example.demo.domain.Cat;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

/**
 * Created by zhangpeng on 2018/6/9.
 */
public interface Cat2Repository extends Repository<Cat,Integer>{
    public Cat findByName(String name);

    /**
     * 如何编写一个JPQL语句，
     *JPQL与Hibernate的HQL语句相似
     */
    @Query("from Cat where name=:name")
    public Cat findMyName(@Param("name") String name);
}
