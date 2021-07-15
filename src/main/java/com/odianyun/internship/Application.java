package com.odianyun.internship;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zfy
 * @create 2021-07-13 9:47
 */
@SpringBootApplication
@MapperScan("com.odianyun.internship.mapper")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }

}
