package com.yl.ylBlog.mapper;

import com.yl.ylBlog.domain.Blog;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigInteger;
import java.util.List;

@Mapper
public interface BlogMapper {
    List<Blog> getAllBlogs();

    Blog getBlogById(@Param("id")BigInteger id);

    void insertBlog(@Param("id")BigInteger id,
                    @Param("title")String title,
                    @Param("content")String content);

    void deleteBlogById(@Param("id")BigInteger id);

    void updateBlogById(@Param("id")BigInteger id,
                        @Param("newTitle")String newTitle,
                        @Param("newContent")String newContent);
}
