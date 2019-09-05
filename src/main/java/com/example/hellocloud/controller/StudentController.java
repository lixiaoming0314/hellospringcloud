package com.example.hellocloud.controller;

import com.example.hellocloud.bean.Student;
import com.example.hellocloud.service.StudentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Api("StudentController api")
@RestController
@RequestMapping("student")
public class StudentController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    StudentService studentService;

    @ApiImplicitParam(name = "id", value = "用户ID",
            required = true, dataType = "Integer", paramType = "path")
    @RequestMapping(value = "hello/{id}",method = RequestMethod.GET)
    public String hello(@PathVariable(value = "id") Integer id){
        return "hello world:"+id;
    }


    @ApiOperation(value = "获取用户列表",notes = "获取用户列表")
    @RequestMapping(value = "findAll",method = RequestMethod.POST)
    public List<Student> findAll(){
        logger.debug("debug日志");
        logger.error("错误日志");
        return studentService.findAll();
    }

    @ApiOperation(value = "添加用户",notes = "添加用户")
    @ApiImplicitParam(name = "student", value = "学生详细实体", required = true, dataType = "Student")
    @RequestMapping(value = "add",method = RequestMethod.POST)
    public void addStudent( Student student){
        studentService.add(student);
    }


}
