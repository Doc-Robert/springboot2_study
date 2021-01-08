package com.geek;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

//配置需要扫描的servlet包
@ServletComponentScan(basePackages = "com.geek")
@SpringBootApplication
public class Springboot2webApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot2webApplication.class, args);
    }

}
