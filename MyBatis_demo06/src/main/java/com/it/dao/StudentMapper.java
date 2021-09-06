package com.it.dao;

import com.it.bean.Student;

import java.util.List;

/**
 * @author ZuYingFang
 * @time 2021-08-16 16:36
 */
public interface StudentMapper {

    // 查询所有学生的信息，以及对应的老师的信息

    // 1、按查询嵌套处理，要写三个标签
    List<Student> getStudents();

    // 2、按结果嵌套处理
    List<Student> getStudents2();

}
