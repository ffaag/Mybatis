package com.it.dao;

import com.it.bean.User;
import com.it.utils.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author ZuYingFang
 * @time 2021-08-17 15:26
 */
public class UserMapperTest {

    @Test
    public void testGetUsers(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.getUsers();
        for (User user : users) {
            System.out.println(user);
        }
        sqlSession.clearCache();   // 手动清除一级缓存
        sqlSession.close();
    }


}
