package br.com.five.seven.food.infra.clients.users.http;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import br.com.five.seven.food.infra.clients.users.config.UsersClientConfig;
import br.com.five.seven.food.infra.clients.users.payload.UsersResponse;


@FeignClient(name = "UsersService", url = "${spring.application.users-client.host1}", configuration = UsersClientConfig.class)
public interface UsersClient {

    @GetMapping("/v1/users")
    ResponseEntity<UsersResponse> getUserByCpf(@RequestParam("cpf") String cpf);

}
