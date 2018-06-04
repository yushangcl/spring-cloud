package cn.itbat.eureka.consumer.ribbon;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableDiscoveryClient
@SpringBootApplication
public class EurekaConsumerRibbonApplication {
    private static final Logger LOGGER = LoggerFactory.getLogger(EurekaConsumerRibbonApplication.class);

    @Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

    public static void main(String[] args) {
        LOGGER.info("EurekaConsumerRibbon 开始启动");
        SpringApplication.run(EurekaConsumerRibbonApplication.class, args);
        LOGGER.info("EurekaConsumerRibbon 启动完成");
    }
}
