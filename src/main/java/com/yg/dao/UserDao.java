package com.yg.dao;

import com.yg.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserDao {

    public int insertUser(@Param("user") User user);
}
