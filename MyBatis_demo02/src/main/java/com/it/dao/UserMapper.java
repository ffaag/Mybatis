package com.it.dao;

import com.it.bean.User;

import java.util.List;
import java.util.Map;

/**
 * @author ZuYingFang
 * @time 2021-08-14 21:24
 */
public interface UserMapper {


    // 获取全部用户
    List<User> getUserList();

    // 根据id查询用户
    User getUserById(Integer id);

    // 插入一个新用户
    int addUser(User user);

    // 修改用户
    int updateUser(User user);

    // 删除用户
    int deleteUserById(Integer id);

}
