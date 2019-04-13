package com.lzy.demo2019413.service;

import com.lzy.demo2019413.dao.StudentDao;
import com.lzy.demo2019413.po.Student;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author lenovo
 * @create 2019-04-13-20:37
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentDao studentDao;

    @Override
    public List<Student> findAll() {
        return studentDao.findAll();
    }

    @Override
    public int delete(int id) {
        return studentDao.delete(id);
    }

    @Override
    public int insert(Student student) {
        return studentDao.insert(student);
    }

    @Override
    public Student findById(int id) {
        return studentDao.findById(id);
    }

    @Override
    public int update(Student student) {
        return studentDao.update(student);
    }

}
