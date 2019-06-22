package com.zzy.blog.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    private int id;
    private String userName;
    private String password;
    private String email;
    private String phone;
    private String img;
}
