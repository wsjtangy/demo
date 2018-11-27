package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author wusj
 */
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        init();
        SpringApplication.run(DemoApplication.class, args);
    }
    public static void init(){
        System.out.println("xx");
    }
}
