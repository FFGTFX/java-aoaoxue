package com.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author wangce
 * @Date 2022/7/26
 */
@SpringBootApplication
//开启Eureka服务注册
@EnableEurekaServer

public class EurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
        System.err.println("(♥◠‿◠)ﾉﾞ  Eureka注册中心启动成功   ლ(´ڡ`ლ)ﾞ");
    }

}
