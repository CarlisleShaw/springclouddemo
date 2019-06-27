package com.shaw.springclouddemo.service;

import com.shaw.springclouddemo.entities.Dept;

import java.util.List;

public interface DeptService {
    boolean add(Dept dept);

    Dept get(long id);

    List list();
}
