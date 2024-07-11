package com.yl.ylBlog.controller;

import com.yl.ylBlog.domain.Test;
import com.yl.ylBlog.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {
    @Autowired
    private TestService testService;

    @GetMapping("/test")
    public List<Test> getBlog() {
        List<Test> tests = testService.getTests();
        return tests;
    }
}
