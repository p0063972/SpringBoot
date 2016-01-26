package com.zjs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@SpringBootApplication
public class HelloSpringBootApplication {

	@Autowired
	private GreetingService greetingService;


   @RequestMapping("/")
    public String hello() {
      return String.format("%s World!", greetingService.getGreeting());
    }


    public static void main(String[] args) {
        SpringApplication.run(HelloSpringBootApplication.class, args);
    }
}
