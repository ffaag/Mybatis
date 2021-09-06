package com.it.dao;

import com.it.bean.Teacher;
import org.apache.ibatis.annotations.Param;

/**
 * @author ZuYingFang
 * @time 2021-08-16 16:36
 */
public interface TeacherMapper {

    Teacher getTeacherById(@Param("id") Integer id);

}
