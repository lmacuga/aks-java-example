package com.example.aks.grievous;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @PostMapping(path = "/hello")
    public ResponseEntity<String> hello(@RequestBody String message) {
        return ResponseEntity.ok("General Kenobi");
    }

}
