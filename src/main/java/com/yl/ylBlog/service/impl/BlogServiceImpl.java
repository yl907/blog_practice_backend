package com.yl.ylBlog.service.impl;

import com.yl.ylBlog.domain.Blog;
import com.yl.ylBlog.mapper.BlogMapper;
import com.yl.ylBlog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;

@Service
public class BlogServiceImpl implements BlogService {
    @Autowired
    private BlogMapper blogMapper;

    @Override
    public List<Blog> getAllBlogs() {
        return blogMapper.getAllBlogs();
    }
    @Override
    public Blog getBlogById(BigInteger id) {
        return blogMapper.getBlogById(id);
    }
    @Override
    public void createBlog(BigInteger id, String title, String content) {
        blogMapper.insertBlog(id, title, content);
    };
    @Override
    public void deleteBlogById(BigInteger id) {
        blogMapper.deleteBlogById(id);
    }
    @Override
    public void updateBlogById(BigInteger id, String newTitle, String newContent){
        blogMapper.updateBlogById(id, newTitle, newContent);
    }
}
