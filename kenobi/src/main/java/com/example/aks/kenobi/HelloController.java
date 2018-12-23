package com.example.aks.kenobi;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class HelloController {

    private GrievousClient grievous;

    @PostMapping(path = "/say")
    public ResponseEntity<String> hello(@RequestBody String message) {
        return ResponseEntity.ok(grievous.hello(message));
    }

}
