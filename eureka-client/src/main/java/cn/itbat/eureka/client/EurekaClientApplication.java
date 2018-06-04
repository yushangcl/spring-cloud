package cn.itbat.eureka.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class EurekaClientApplication {
	private static final Logger LOGGER = LoggerFactory.getLogger(EurekaClientApplication.class);

	public static void main(String[] args) {
		LOGGER.info("EurekaClient 开始启动");
		SpringApplication.run(EurekaClientApplication.class, args);
		LOGGER.info("EurekaClient 启动完成");
	}
}
