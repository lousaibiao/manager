package com.lou.manager.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@ConfigurationProperties(prefix = "lou")
public class MyProperties {
    private int id;
    private String name;
    private List<String> values;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getValues() {
        return values;
    }

    public void setValues(List<String> values) {
        this.values = values;
    }

    @Override
    public String toString() {
        return "MyProperties{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", values=" + values +
                '}';
    }
}
