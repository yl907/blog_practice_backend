package com.yl.ylBlog.mapper;

import com.yl.ylBlog.domain.Test;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TestMapper {
    List<Test> findAll();
}
