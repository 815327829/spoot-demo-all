package com.example.demoredis;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootTest
class DemoRedisApplicationTests {


    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    void testSet() {
        //存入数据
        redisTemplate.boundValueOps("name").set("zs success!");

    }


    @Test
    void testGet() {
        //获取数据
        Object name = redisTemplate.boundValueOps("name").get();
        System.out.println(name);
    }

}
