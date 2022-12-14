package com.example.springboot3dummy.works;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.stereotype.Service;
import com.example.springboot3dummy.other.OtherService;

@Service
@ConditionalOnBean(OtherService.class)
public class AService {

    private final OtherService otherService;

    public AService(OtherService otherService) {
        this.otherService = otherService;
    }

    public String test() {
        return "Test";
    }
}
