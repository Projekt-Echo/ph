package client

import redis.clients.jedis.Jedis

object RedisClient {
    val jedis = Jedis("apn1-ideal-ape-33441.upstash.io", 33441, true)
}