package com.shaw.springclouddemo.dao;

import com.shaw.springclouddemo.entities.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DeptDao {

    Dept findById(long id);

    List<Dept> findAll();

    boolean addDept(Dept dept);

}