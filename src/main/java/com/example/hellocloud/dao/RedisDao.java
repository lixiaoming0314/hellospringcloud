package com.example.hellocloud.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class RedisDao {
    @Autowired
    private StringRedisTemplate redisTemplate;


}
