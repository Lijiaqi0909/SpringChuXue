package com.study.springchuxue;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringChuxueApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringChuxueApplication.class, args);


    }

}
