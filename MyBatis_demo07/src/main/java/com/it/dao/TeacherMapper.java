package com.it.dao;

import com.it.bean.Teacher;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author ZuYingFang
 * @time 2021-08-16 16:36
 */
public interface TeacherMapper {

    List<Teacher> getTeachers();


    // 获取指定老师的所有学生和老师的信息

    // 1、按结果嵌套处理
    Teacher getTeacher(@Param("tid") Integer id);

    // 2、按查询嵌套处理
    Teacher getTeacher2(@Param("tid") Integer id);

}
