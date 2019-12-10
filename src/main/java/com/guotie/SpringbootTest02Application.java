package com.guotie;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;

@SpringBootApplication(exclude = MongoAutoConfiguration.class)
@MapperScan("com.guotie.mapper")//@MapperScan 用户扫描MyBatis的Mapper
public class SpringbootTest02Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootTest02Application.class, args);
    }

}
