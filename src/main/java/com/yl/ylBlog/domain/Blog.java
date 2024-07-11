package com.yl.ylBlog.domain;

import lombok.Data;

import java.math.BigInteger;

@Data
public class Blog {
    private BigInteger id;
    private String title;
    private String content;
}
