package com.example.haulmonttesttask;

import org.hsqldb.util.DatabaseManagerSwing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

import javax.annotation.PostConstruct;

@SpringBootApplication
//@ImportResource(value="classpath:/hsql_cfg.xml")
public class HaulmontTestTaskApplication {

    public static void main(String[] args) {
        SpringApplication.run(HaulmontTestTaskApplication.class, args);
    }

}
