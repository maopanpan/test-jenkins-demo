package com.myself.jenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类名称：DemoApplication<br>
 * 类描述：<br>
 * 创建时间：2019年07月16日<br>
 *
 * @author maopanpan
 * @version 1.0.0
 */
@SpringBootApplication
@RestController
public class DemoApplication {

    @GetMapping(value = "/sayHello")
    public String sayHello() {
        return "Hello world!";
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
