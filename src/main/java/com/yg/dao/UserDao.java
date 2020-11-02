package com.yg.dao;

import com.yg.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserDao {

    public int insertUser(@Param("user") User user);

    int add1();

    int add2();

    int add3();

    int add4();

    int add5();}
