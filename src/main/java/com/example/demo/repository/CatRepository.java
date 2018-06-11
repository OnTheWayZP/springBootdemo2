package com.example.demo.repository;

import com.example.demo.domain.Cat;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by zhangpeng on 2018/6/8.
 */
public interface CatRepository extends CrudRepository<Cat,Integer> {
}
