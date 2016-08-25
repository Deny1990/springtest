package yuan.spring.boot.test.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yuanxin on 16/8/10.
 */

@RestController
@EnableAutoConfiguration
public class SpringBootTest {

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

    @RequestMapping("/hello/yuan")
    public String hello() {
        return "Hello World yuan!";
    }

}