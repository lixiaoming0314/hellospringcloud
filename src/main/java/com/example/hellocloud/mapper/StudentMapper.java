package com.example.hellocloud.mapper;

import com.example.hellocloud.bean.Student;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface StudentMapper {
    List<Student> findAll();

    boolean addStudent(Student student);
}
