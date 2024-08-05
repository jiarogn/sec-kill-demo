package com.rabbitmq;


import com.rabbitmq.config.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
* 参考：
* https://xie.infoq.cn/article/013d51870a6c5840f937c70a4
* */
@SpringBootApplication
public class ConsumerApplication implements ApplicationRunner {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }

    @Autowired
    private RedisService redisService;

    /**
     * redis初始化各商品的库存量
     * @param args
     * @throws Exception
     */
    @Override
    public void run(ApplicationArguments args) throws Exception {
        redisService.put("watch", 10000, 20);
    }

}

