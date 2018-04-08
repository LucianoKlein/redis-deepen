package com.hexin.redis;

import redis.clients.jedis.Jedis;

import java.util.Set;

public class TestAPI {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("127.0.0.1", 6379);

        System.out.println(jedis.get("k5"));
        System.out.println(jedis.keys("*"));
        Set<String> set = jedis.keys("*");
        System.out.println(set.size());
    }
}
