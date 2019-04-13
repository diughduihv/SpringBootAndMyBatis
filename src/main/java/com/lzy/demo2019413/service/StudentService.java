package com.lzy.demo2019413.service;

import com.lzy.demo2019413.po.Student;

import java.util.List;

/**
 * @author lenovo
 * @create 2019-04-13-20:36
 */
public interface StudentService {

    List<Student> findAll();

    int delete(int id);

    int insert(Student student);

    Student findById(int id);

    int update(Student student);

}
