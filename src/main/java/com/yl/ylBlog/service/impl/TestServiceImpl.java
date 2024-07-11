package com.yl.ylBlog.service.impl;

import com.yl.ylBlog.domain.Test;
import com.yl.ylBlog.mapper.TestMapper;
import com.yl.ylBlog.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {
    @Autowired
    TestMapper testMapper;

    @Override
    public List<Test> getTests () {
        List<Test> tests = testMapper.findAll();
        return tests;
    }
}
