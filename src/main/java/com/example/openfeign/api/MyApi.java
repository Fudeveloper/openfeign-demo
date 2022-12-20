package com.example.openfeign.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "api-proxy",url = "http://127.0.0.1:8080",configuration = MyApiConfiguration.class)
public interface MyApi {
    @GetMapping("/test/my")
    String testForGet();
}
