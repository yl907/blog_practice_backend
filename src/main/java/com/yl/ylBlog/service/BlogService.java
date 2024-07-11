package com.yl.ylBlog.service;

import com.yl.ylBlog.domain.Blog;

import java.math.BigInteger;
import java.util.List;

public interface BlogService {
    List<Blog> getAllBlogs();
    Blog getBlogById(BigInteger id);
    void createBlog(BigInteger id, String title, String content);
    void deleteBlogById(BigInteger id);
    void updateBlogById(BigInteger id, String newTitle, String newContent);
}
