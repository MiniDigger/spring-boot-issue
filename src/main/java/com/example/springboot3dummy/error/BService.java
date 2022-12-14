package com.example.springboot3dummy.error;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.stereotype.Service;
import com.example.springboot3dummy.other.OtherService;

@Service
@ConditionalOnBean(OtherService.class)
public class BService {

    private final OtherService otherService;

    public BService(OtherService otherService) {
        this.otherService = otherService;
    }

    public String test() {
        return "Test";
    }
}
