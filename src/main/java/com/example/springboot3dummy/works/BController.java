package com.example.springboot3dummy.works;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ConditionalOnBean(AService.class)
public class BController {

    private final AService service;

    @Autowired
    public BController(AService service) {
        this.service = service;
    }

    @GetMapping("/works")
    public String test() {
        return service.test();
    }
}
