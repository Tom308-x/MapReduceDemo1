package com.cssl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.cssl.mapper")
public class BookmanagerSysApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookmanagerSysApplication.class, args);
    }

}
