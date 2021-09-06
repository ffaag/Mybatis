package com.it.dao;

import com.it.bean.User;
import com.it.utils.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * @author ZuYingFang
 * @time 2021-08-14 21:37
 */
public class UserMapperTest {

    static Logger logger = Logger.getLogger(UserMapperTest.class);


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

    @Test
    public void testLOG4J(){
        logger.info("info：进入selectUser方法");
        logger.debug("debug：进入selectUser方法");
        logger.error("error: 进入selectUser方法");
        /*SqlSession session =MyBatisUtil.getSqlSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        List<User> users = mapper.getUserList();
        for (User user: users){
            System.out.println(user);
        }
        session.close();*/
    }

    @Test
    public void testGetUserByLimit(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("startIndex", 0);
        map.put("pageSize", 2);

        List<User> userByLimit = mapper.getUserByLimit(map);
        for (User user : userByLimit) {
            System.out.println(user);
        }
        sqlSession.close();
    }
}
