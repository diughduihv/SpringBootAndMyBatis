package com.lzy.demo2019413.dao;

import com.lzy.demo2019413.po.Student;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author lenovo
 * @create 2019-04-13-20:33
 */
@Mapper
@Repository
public interface StudentDao {

    @Select("select * from student")
    List<Student> findAll();

    @Delete("delete from student where id=#{id}")
    int delete(int id);

    @Insert("insert into student(StudentName) values(#{StudentName})")
    int insert(Student student);

    @Select("select * from student where id=#{id}")
    Student findById(int id);

    @Update("update student set StudentName=#{StudentName} where id=#{id}")
    int update(Student student);

}
