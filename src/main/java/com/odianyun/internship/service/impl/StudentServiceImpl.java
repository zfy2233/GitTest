package com.odianyun.internship.service.impl;

import com.odianyun.internship.mapper.StudentMapper;
import com.odianyun.internship.pojo.Student;
import com.odianyun.internship.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zfy
 * @create 2021-07-15 16:00
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public Student getById(Long id) {
        return studentMapper.getById(id);
    }
}
