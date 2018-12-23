package com.example.aks.kenobi;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "grievousClient", url = "http://grievous-service:8080")
public interface GrievousClient {

    @PostMapping(path = "/hello")
    String hello(@RequestBody String message);
}
