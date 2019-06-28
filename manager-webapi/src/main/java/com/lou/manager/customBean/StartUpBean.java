package com.lou.manager.customBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;

@Order(1)
@Component
public class StartUpBean implements Ordered {
    @Autowired
    public StartUpBean(ApplicationArguments args) {
        final boolean containsDebug = args.containsOption("debug");
        final List<String> nonOptionArgs = args.getNonOptionArgs();
        final Set<String> optionNames = args.getOptionNames();
        System.out.println(optionNames);
        System.out.println("containsDebug:" + containsDebug);
        System.out.println("nonOptionArgs:" + nonOptionArgs);
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
