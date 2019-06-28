package com.lou.manager;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {

        //不写这句，用new的方式来执行
        SpringApplication.run(Application.class,args);
//        final SpringApplication springApplication = new SpringApplication(Application.class);
        //添加一些监听配置
        //springApplication.addListeners();
        //springApplication.setBannerMode(Banner.Mode.LOG);
//        springApplication.run(args);
    }
}
