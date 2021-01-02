package com.mxxk.lightstar;

import com.mxxk.lightstar.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * RedisObject
 *
 * @auther zhang
 * @date 2020/6/8
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = LightStarApplication.class)
public class RedisObject {

    @Autowired
    private RedisTemplate redisTemplate;


    @Test
    public void setObject(){
        System.out.println("----------------存入redis user对象-----------------");
        User user=new User();
        user.setUsername("beerzhijin");
        user.setId(10);
        user.setAge(20);
        this.redisTemplate.opsForValue().set("stu",user);
        System.out.println("可以");
    }

    @Test
    public void getObject(){
        User stu=(User)this.redisTemplate.opsForValue().get("stu");
        System.out.println(stu.getId()+"："+stu.getUsername()+"："+stu.getAge());
    }
}
