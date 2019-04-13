package com.lzy.demo2019413.handler;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lzy.demo2019413.po.Student;
import com.lzy.demo2019413.service.StudentService;
import org.apache.tomcat.util.buf.UDecoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.rmi.StubNotFoundException;
import java.util.List;
import java.util.Map;

/**
 * @author lenovo
 * @create 2019-04-13-20:39
 */
@Controller
public class StudentHandler {

    @Resource
    private StudentService studentService;

    @RequestMapping("/")
    public String findAll(Map<String, Object> map, Integer pageNum){
        if (pageNum == null) {
            pageNum = 1;
        }
        PageHelper.startPage(pageNum,10);
        List<Student> list = studentService.findAll();
        PageInfo info = new PageInfo();
        int pages = info.getPages();
        map.put("student",list);
        map.put("pageNum",pageNum);
        map.put("pages",pages);
        return "findAll";
    }

    @RequestMapping("/delete")
    public String delete(int id){
        studentService.delete(id);
        return "redirect:/";
    }

    @RequestMapping("/inserts")
    public String inserts(){
        return "insert";
    }

    @RequestMapping("/insert")
    public String insert(Student student){
        studentService.insert(student);
        return "redirect:/";
    }

    @RequestMapping("/findById")
    public String findById(int id,Map<String, Object> map){
        Student student = studentService.findById(id);
        map.put("student",student);
        return "update";
    }

    @RequestMapping("/update")
    public String update(Student student){
        studentService.update(student);
        return "redirect:/";
    }

}
