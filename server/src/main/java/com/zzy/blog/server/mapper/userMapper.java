package com.zzy.blog.server.mapper;

import com.zzy.blog.entity.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface userMapper {

    @Select("SELECT userName,password from blog.user where userName = #{userName}")
    User getByUserName(String userName);
}
