package com.cafe24.shkim.RedisTest.controller;

import com.cafe24.shkim.RedisTest.util.utilRedis;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class MainController {

    private final utilRedis utilRedis;

    @GetMapping("/lettuce/set")
    public String lettuceSet() {
        utilRedis.set("test111", "1");

        return "set";
    }

    @GetMapping("/lettuce/zadd")
    public String lettuceZadd() {
        utilRedis.zadd("key_zadd", 0,"value1");

        return "set";
    }
}
