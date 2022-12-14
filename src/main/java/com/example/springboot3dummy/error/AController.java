package com.example.springboot3dummy.error;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ConditionalOnBean(BService.class)
public class AController {

    private final BService service;

    @Autowired
    public AController(BService service) {
        this.service = service;
    }

    @GetMapping("/error")
    public String test() {
        return service.test();
    }
}
