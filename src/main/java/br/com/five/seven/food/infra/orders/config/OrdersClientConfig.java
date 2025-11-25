package br.com.five.seven.food.infra.orders.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import feign.Logger;

@Configuration
public class OrdersClientConfig {

    @Bean("ordersClientFeignLoggerLevel")
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }
}
