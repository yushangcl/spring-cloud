package cn.itbat.eureka.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableDiscoveryClient
@SpringBootApplication
public class EurekaConsumerApplication {
    private static final Logger LOGGER = LoggerFactory.getLogger(EurekaConsumerApplication.class);

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public static void main(String[] args) {
        LOGGER.info("EurekaClient 开始启动");
        SpringApplication.run(EurekaConsumerApplication.class, args);
        LOGGER.info("EurekaClient 启动完成");
    }
}
