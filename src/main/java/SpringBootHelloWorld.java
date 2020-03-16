package net.codejava;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class SpringBootHelloWorld {
    String appVersion = System.getenv("INPUT_VERSION");

    @RequestMapping("/")
    String home() {
        return "No saint either" + appVersion ;
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SpringBootHelloWorld.class, args);
    }

}
