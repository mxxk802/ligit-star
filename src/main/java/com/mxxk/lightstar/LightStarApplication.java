package com.mxxk.lightstar;

import com.mxxk.lightstar.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;

@SpringBootApplication
public class LightStarApplication {
	public static void main(String[] args) {
		SpringApplication.run(LightStarApplication.class, args);
	}

}
