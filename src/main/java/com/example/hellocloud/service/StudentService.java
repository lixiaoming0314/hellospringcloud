package com.example.hellocloud.service;

import com.example.hellocloud.bean.Student;
import com.example.hellocloud.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentDao studentDao;

    public List<Student> findAll(){
       return studentDao.findAll();
    }

    public boolean add(Student student){
        return studentDao.addStudent(student);
    }
}
