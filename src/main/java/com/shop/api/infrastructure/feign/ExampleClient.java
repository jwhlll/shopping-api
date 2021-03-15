package com.shop.api.infrastructure.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Example 연동 Client
 * @author
 */
@FeignClient(name = "Example", url = "${test.url:http://localhost:8888}")
public interface ExampleClient {

    @GetMapping("/test/{id}")
    String login(@PathVariable("id") String id);
}
