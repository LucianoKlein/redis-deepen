package com.hexin.redis;

import redis.clients.jedis.Jedis;

import java.util.*;

public class TestAPI {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("127.0.0.1", 6379);

        jedis.hset("hash1", "userName", "lisi");
        System.out.println(jedis.hget("hash1", "userName"));

        System.out.println("------------------------");

        Map<String, String> map = new HashMap<String, String>();
        map.put("telephone", "138919191919191");
        map.put("adreess", "nanjing");
        map.put("email", "aaa@126.com");
        jedis.hmset("hash2", map);
        List<String> result = jedis.hmget("hash2", "telephone", "email");
        for (String element: result) {
            System.out.println(element);
        }

    }
}
