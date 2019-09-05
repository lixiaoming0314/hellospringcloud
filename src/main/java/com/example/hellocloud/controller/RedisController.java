package com.example.hellocloud.controller;

import com.example.hellocloud.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("redis")
public class RedisController {

    private static int ExpireTime = 60;   // redis中存储的过期时间60s

    @Autowired
    private RedisUtil redisUtil;

    @RequestMapping("set")
    public boolean redisSet(String key, String value){
        return redisUtil.set(key,value);
    }

    @RequestMapping("get")
    public Object redisGet(String key){
        return redisUtil.get(key);
    }

    @RequestMapping("expire")
    public boolean expire(String key){
        return redisUtil.expire(key,ExpireTime);
    }

}
