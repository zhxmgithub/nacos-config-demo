package com.xiaoman.nacos.config;


import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.io.Serializable;

/**
  * @author xiaomzhong
  * @description 不支持动态变更，必须重启服务
  * @createTime 2022/10/8 18:39
  */
@Data
@Accessors(chain = true)
@ConfigurationProperties(prefix = "xiaom.config")
public class AppConfig implements Serializable {
    private static final long serialVersionUID = 8383624463989684212L;

    private String id;

    private String name;

    private Integer count;
}
