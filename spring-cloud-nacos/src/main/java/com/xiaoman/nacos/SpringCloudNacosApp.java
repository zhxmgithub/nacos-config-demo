package com.xiaoman.nacos;

import com.xiaoman.nacos.config.AppConfig;
import com.xiaoman.nacos.config.NacosConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({AppConfig.class, NacosConfig.class})
public class SpringCloudNacosApp {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudNacosApp.class, args);
        System.out.println("Hello world!");
    }
}