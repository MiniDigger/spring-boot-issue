package com.example.springboot3dummy.other;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

@Service
@ConditionalOnProperty("dum")
public class OtherService {

}
