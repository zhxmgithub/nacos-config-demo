package com.xiaoman.nacos;

import com.alibaba.nacos.spring.context.annotation.config.EnableNacosConfig;
import com.xiaoman.nacos.config.AppConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({AppConfig.class})
@EnableNacosConfig
public class SpringBootNacosApp {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootNacosApp.class, args);
        System.out.println("SpringBootNacosApp run ok");
    }
}