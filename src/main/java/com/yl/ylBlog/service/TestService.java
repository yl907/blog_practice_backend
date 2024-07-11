package com.yl.ylBlog.service;

import com.yl.ylBlog.domain.Test;
import com.yl.ylBlog.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description: 练习
 */
public interface TestService {
    /**
     * 练习
     * @return
     */
    List<Test> getTests();
}