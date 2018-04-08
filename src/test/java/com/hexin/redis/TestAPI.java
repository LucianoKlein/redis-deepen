package com.hexin.redis;

import redis.clients.jedis.Jedis;

import java.util.*;

public class TestAPI {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("127.0.0.1", 6379);

        jedis.zadd("zset01", 60d, "v1");
        jedis.zadd("zset01", 70d, "v2");
        jedis.zadd("zset01", 80d, "v3");
        jedis.zadd("zset01", 90d, "v4");
        Set<String> s1 = jedis.zrevrangeByScore("zset01", 100, 0);
        for (Iterator iterator = s1.iterator(); iterator.hasNext();) {
            String string = (String) iterator.next();
            System.out.println(string);
        }

    }
}
