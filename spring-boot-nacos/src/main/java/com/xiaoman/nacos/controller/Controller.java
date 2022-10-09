package com.xiaoman.nacos.controller;

import com.xiaoman.nacos.config.AppConfig;
import com.xiaoman.nacos.config.NacosConfig;
import lombok.extern.slf4j.Slf4j;
import org.redisson.api.RedissonClient;
import org.redisson.client.codec.StringCodec;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/springboot/nacos")
@Slf4j
public class Controller {

    private final AppConfig appConfig;

    private final NacosConfig nacosConfig;

    private final RedissonClient redissonClient;


    public Controller(AppConfig appConfig, NacosConfig nacosConfig, RedissonClient redissonClient) {
        this.appConfig = appConfig;
        this.nacosConfig = nacosConfig;
        this.redissonClient = redissonClient;
    }

    @GetMapping("/config")
    public Object getConfig() {
        log.info("appConfig={},nacosConfig={}", appConfig, nacosConfig);
        return appConfig.toString() + ";" + nacosConfig.toString();
    }

    @GetMapping("/setRedis")
    public Object setRedis(@RequestParam("value") String value) {
        log.info("redissonClient={}", redissonClient.getConfig());
        redissonClient.getBucket("nacos-config", StringCodec.INSTANCE).set(value);
        return "ok";
    }

    @GetMapping("/getRedis")
    public Object getRedisConfig() {
        log.info("redissonClient={}", redissonClient.getConfig());
        return redissonClient.getBucket("nacos-config", StringCodec.INSTANCE);
    }


}
