package com.hexin.redis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.Transaction;

public class TestTransaction {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("localhost", 6379);
        Transaction transaction = jedis.multi();

        transaction.set("k4", "v44");
        transaction.set("k5", "v55");

        transaction.discard();
        System.out.println(jedis.get("k4"));
        System.out.println(jedis.get("k5"));
    }
}
