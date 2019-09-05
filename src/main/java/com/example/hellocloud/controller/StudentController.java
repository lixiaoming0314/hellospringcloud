package com.example.hellocloud.controller;

import com.example.hellocloud.bean.Student;
import com.example.hellocloud.service.StudentService;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("student")
public class StudentController {


    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    StudentService studentService;

    @RequestMapping("hello")
    public String hello(){
        return "hello world";
    }

    @ApiOperation(value = "获取用户列表",notes = "获取用户列表")
    @RequestMapping("findAll")
    public List<Student> findAll(){
        logger.debug("debug日志");
        logger.error("错误日志");
        return studentService.findAll();
    }


}
