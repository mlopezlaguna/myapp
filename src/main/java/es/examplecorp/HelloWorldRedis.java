package es.examplecorp;

/**
 * Created with IntelliJ IDEA.
 * User: jorge
 * Date: 1/17/17
 * Time: 4:39 PM
 * To change this template use File | Settings | File Templates.
 */

package es.examplecorp;

import static spark.Spark.*;
import redis.clients.jedis.Jedis;

public class HelloWorldRedis {
    public static void main(String[] args){
        // jedis.auth("password");
        post("/bye",(req,res) -> redisSetContent("hello","world"));
        get("/hello",(req,res) -> redisContent("hello"));
    }

    private static String redisSetContent(String key, String value) {
        Jedis jedis = new Jedis("localhost",6379);
        jedis.set(key,value);
        return "value";
    }

    private static String redisContent(String key) {
        Jedis jedis = new Jedis("localhost",6379);
        return jedis.get("hello");
    }
}

