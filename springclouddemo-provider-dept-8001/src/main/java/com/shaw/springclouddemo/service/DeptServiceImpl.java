package com.shaw.springclouddemo.service;

import com.shaw.springclouddemo.dao.DeptDao;
import com.shaw.springclouddemo.entities.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptDao dao;

    @Override
    public boolean add(Dept dept) {
        return dao.addDept(dept);
    }

    @Override
    public Dept get(long id) {
        return dao.findById(id);
    }

    @Override
    public List list() {
        return dao.findAll();
    }
}
