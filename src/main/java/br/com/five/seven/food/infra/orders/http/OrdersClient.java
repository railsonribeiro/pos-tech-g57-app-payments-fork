package br.com.five.seven.food.infra.orders.http;

import br.com.five.seven.food.infra.orders.config.OrdersClientConfig;
import br.com.five.seven.food.infra.orders.payload.OrderResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "OrdersService", url = "${spring.application.orders-client.host1}", configuration = OrdersClientConfig.class)
public interface OrdersClient {

    @GetMapping("/v1/orders/{id}")
    ResponseEntity<OrderResponse> getOrderById(@PathVariable("id") String idOrder);

}
