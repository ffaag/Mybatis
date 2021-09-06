package com.it.dao;

import com.it.bean.User;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

/**
 * @author ZuYingFang
 * @time 2021-08-14 21:24
 */
public interface UserMapper {

    @Select("select * from user")
    List<User> getUsers();

    @Select("select * from user where id = #{id} and name = #{name}")
    // 方法存在多个参数，不用map传参时用这个注解来传递
    List<User> getUserById(@Param("id") Integer id, @Param("name") String name);

    @Insert("insert into user(id, name, pwd) values (#{id}, #{name}, #{pwd})")
    int addUser(User user);

    @Update("update user set name=#{name}, pwd=#{pwd} where id=#{id}")
    int updateUser(User user);

    @Delete("delete from user where id = #{id}")
    int deleteUser(Integer id);

}
