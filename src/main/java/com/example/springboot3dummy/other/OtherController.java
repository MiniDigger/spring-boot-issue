package com.example.springboot3dummy.other;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OtherController {

    @GetMapping("/other")
    public String test() {
        return "dum";
    }

}
