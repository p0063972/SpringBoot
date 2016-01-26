package com.zjs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;

@RestController
@SpringBootApplication
public class HelloSpringBootApplication {

	@Value("${greeting}")
    String greeting;

   @RequestMapping("/")
    public String hello() {
      return String.format("%s World!", greeting);
    }


    public static void main(String[] args) {
        SpringApplication.run(HelloSpringBootApplication.class, args);
    }
}
