package com.lou.manager.controller;

import com.lou.manager.User;
import com.lou.manager.configuration.MyProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.Random;

@RestController
public class TestController {
    private final Random random = new Random();
    private final Logger logger = LoggerFactory.getLogger(TestController.class);

    private final MyProperties myProperties;

    @Autowired
    public TestController(MyProperties myProperties) {
        this.myProperties = myProperties;
    }

    @GetMapping("/test/curDate")
    public Date Test() {
        return new Date();
    }

    @GetMapping("/test/getUser")
    public User getUser(@RequestParam(name = "userId", defaultValue = "1234") int userId) {
        User user = new User();
        user.setName("hello   bb");
        user.setId(userId);
        user.setAge(random.nextInt(40));
        logger.info(user.toString());
        return user;
    }

    @GetMapping("/test/getMyProps")
    public MyProperties getProperties() {
        return this.myProperties;
    }
}
