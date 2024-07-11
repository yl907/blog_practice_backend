package com.yl.ylBlog.controller;

import com.yl.ylBlog.domain.Blog;
import com.yl.ylBlog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;

@RestController
public class BlogController {
    private final BlogService blogService;
    @Autowired
    public BlogController(BlogService blogService){
        this.blogService = blogService;
    }

    @GetMapping("/blog/{id}")
    public Blog getBlogById(@PathVariable("id") BigInteger id) {
        return blogService.getBlogById(id);
    }

    @PostMapping("/blog/createBlog")
    // 前端的POST请求中的请求属性会自动给到Blog类对象。
    public void createBlog(@RequestParam BigInteger id,
                           @RequestParam String title,
                           @RequestParam String content) {
        blogService.createBlog(id, title, content);
    }

//    这是用@RequestBody + 前端fetch实现的方式。暂时没用这种方式。
//    public void createBlog(@RequestBody Blog blog) {
//        blogService.createBlog(blog.getId(), blog.getTitle(), blog.getContent());
//    }

    @GetMapping("/blog/deleteBlog/{id}")
    public void deleteBlogById(@PathVariable("id") BigInteger id) {
        blogService.deleteBlogById(id);
    }

    @PostMapping("/blog/updateBlog")
    public void updateBlogById(@RequestParam BigInteger id,
                               @RequestParam String newTitle,
                               @RequestParam String newContent) {
        blogService.updateBlogById(id, newTitle, newContent);
    }
}
