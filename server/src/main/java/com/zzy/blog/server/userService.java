package com.zzy.blog.server;

import com.zzy.blog.entity.User;
import com.zzy.blog.server.mapper.userMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class userService{

    private com.zzy.blog.server.mapper.userMapper userMapper;

    @Autowired
    userService(userMapper userMapper) {
        this.userMapper = userMapper;
    }

    public User getByUserName(String userName) {
        return userMapper.getByUserName(userName);
    }
}
