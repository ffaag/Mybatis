package com.it.bean;

import java.util.List;

/**
 * @author ZuYingFang
 * @time 2021-08-16 16:33
 */
public class Teacher {

    private Integer id;

    private String name;

    // 一个老师拥有多个学生
    private List<Student> students;

    public Teacher() {
    }

    public Teacher(Integer id, String name, List<Student> students) {
        this.id = id;
        this.name = name;
        this.students = students;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", students=" + students +
                '}';
    }
}
