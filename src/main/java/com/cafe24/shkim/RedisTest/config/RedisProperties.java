package com.cafe24.shkim.RedisTest.config;

import lombok.Setter;
import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Getter
@Setter
@ConfigurationProperties(prefix = "spring.redis")
@Component
public class RedisProperties {
    private String host;
    private int port;
    private String password;
    private long timeout;
}
