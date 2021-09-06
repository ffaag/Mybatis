package com.it.dao;

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
    public void testGetTeachers(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        List<Teacher> teachers = mapper.getTeachers();
        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }
        sqlSession.commit();
    }

    @Test
    public void testGetTeacher(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher1 = mapper.getTeacher(1);
        System.out.println(teacher1);

        sqlSession.commit();
    }

    @Test
    public void testGetTeacher2(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher1 = mapper.getTeacher2(1);
        System.out.println(teacher1);

        sqlSession.commit();
    }

}
