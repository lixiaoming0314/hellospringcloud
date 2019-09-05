package com.example.hellocloud.dao;

import com.example.hellocloud.bean.Student;
import com.example.hellocloud.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDao {
    @Autowired
    StudentMapper studentMapper;

    public List<Student> findAll(){
        return studentMapper.findAll();
    }
}
