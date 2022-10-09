package com.xiaoman.nacos.config;

import com.alibaba.nacos.api.config.ConfigType;
import com.alibaba.nacos.api.config.annotation.NacosConfigurationProperties;
import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
  * @author xiaomzhong
  * @description 支持不重启服务动态更新
  * @createTime 2022/10/8 18:39
  */
@Data
@Accessors(chain = true)
@RefreshScope
@ConfigurationProperties(prefix = "xiaom.nacos")
public class NacosConfig implements Serializable {
    private static final long serialVersionUID = 2286964456642065215L;

    private String id;

    private String name;

    private Integer count;
}
