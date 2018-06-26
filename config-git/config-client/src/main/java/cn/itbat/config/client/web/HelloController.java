package cn.itbat.config.client.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author huahui.wu
 * @date 2018/6/26 13:32
 * @description
 */
@RestController
public class HelloController {
    @Value("${neo.hello}")
    private String hello;

    @GetMapping("/hello")
    public String from() {
        return this.hello;
    }
}
