package com.lou.manager.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.nio.file.*;
import java.util.Date;

@Component
public class CustomRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        //类似Path.combime(...)
        final Path path = Paths.get(System.getProperty("user.dir"), "1.txt");
        String str = "现在时间是：" + new Date().toString() + System.lineSeparator();
        try {
            Files.write(path, str.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
