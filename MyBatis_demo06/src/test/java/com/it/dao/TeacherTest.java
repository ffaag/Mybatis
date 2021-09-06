package com.it.dao;

import com.it.bean.Student;
import com.it.bean.Teacher;
import com.it.utils.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author ZuYingFang
 * @time 2021-08-16 16:47
 */
public class TeacherTest {

    @Test
    public void testGetTeacherById(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacherById = mapper.getTeacherById(1);
        System.out.println(teacherById);
        sqlSession.close();
    }



}
