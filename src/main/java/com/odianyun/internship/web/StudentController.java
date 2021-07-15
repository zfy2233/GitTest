package com.odianyun.internship.web;

import com.odianyun.internship.pojo.Student;
import com.odianyun.internship.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zfy
 * @create 2021-07-15 15:42
 */
@RestController
@RequestMapping("student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("getbyid")
    public Student getById(Long id){
        return studentService.getById(id);

    }
}
