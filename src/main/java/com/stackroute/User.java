package com.stackroute;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class User
{
    @Value("dileep")
    private String name;
    @Value("23")
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
