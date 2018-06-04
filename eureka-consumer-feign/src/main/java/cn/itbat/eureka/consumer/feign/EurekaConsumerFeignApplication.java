package cn.itbat.eureka.consumer.feign;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaConsumerFeignApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(EurekaConsumerFeignApplication.class);

	public static void main(String[] args) {
		LOGGER.info("EurekaConsumerFeign 开始启动");
		SpringApplication.run(EurekaConsumerFeignApplication.class, args);
		LOGGER.info("EurekaConsumerFeign 启动完成");
	}
}
