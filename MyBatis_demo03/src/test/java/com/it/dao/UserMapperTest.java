package com.it.dao;

import com.it.bean.User;
import com.it.utils.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author ZuYingFang
 * @time 2021-08-14 21:37
 */
public class UserMapperTest {


    @Test
    public void testGetUserList(){
        // 首先获得sqlSession对象
        SqlSession sqlSession = MyBatisUtil.getSqlSession();

        // 通过sqlSession获得对应接口对象
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = userMapper.getUserList();
        for (User user : userList) {
            System.out.println(user);
        }

        // 关闭sqlSession
        sqlSession.close();
    }

    @Test
    public void testGetUserById(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User userById = mapper.getUserById(2);
        System.out.println(userById);
        sqlSession.close();
    }


    // 所有的增删改是需要提交事务的
    @Test
    public void testAddUser(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int a = mapper.addUser(new User(4, "王五", "159735"));

        // 提交事务
        sqlSession.commit();

        sqlSession.close();
    }


    @Test
    public void testUpdateUser(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int a = mapper.updateUser(new User(2, "张三", "2968262"));

        // 提交事务
        sqlSession.commit();

        sqlSession.close();
    }

    @Test
    public void testDeleteUser(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int a = mapper.deleteUserById(1);

        // 提交事务
        sqlSession.commit();

        sqlSession.close();
    }
}
