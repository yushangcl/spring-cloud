package cn.itbat.consul.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ConsulClientApplication {
    private static final Logger LOGGER = LoggerFactory.getLogger(ConsulClientApplication.class);

    public static void main(String[] args) {
        LOGGER.info("ConsulClient 开始启动");
        SpringApplication.run(ConsulClientApplication.class, args);
        LOGGER.info("ConsulClient 启动完成");
    }
}

