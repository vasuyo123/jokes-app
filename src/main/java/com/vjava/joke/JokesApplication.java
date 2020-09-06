package com.vjava.joke;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

import java.util.Arrays;

@SpringBootApplication
@ImportResource("classpath:chuck-config.xml")
public class JokesApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(JokesApplication.class, args);

        Arrays.stream(applicationContext.getBeanDefinitionNames()).
                filter(str -> str.startsWith("j") || str.startsWith("c")).
                sorted().forEach(System.out::println);

    }

}
