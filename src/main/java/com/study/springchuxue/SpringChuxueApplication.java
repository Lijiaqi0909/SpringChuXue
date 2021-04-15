package com.study.springchuxue;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


/**
 * @author XXHH
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class SpringChuxueApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringChuxueApplication.class, args);


    }

}
