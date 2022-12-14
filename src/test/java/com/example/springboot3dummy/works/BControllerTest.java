package com.example.springboot3dummy.works;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import com.example.springboot3dummy.other.OtherController;

@WebMvcTest(OtherController.class)
@TestPropertySource(properties = {"dum=false"})
@ComponentScan(basePackages = {"com.example.springboot3dummy.works", "com.example.springboot3dummy.other"})
public class BControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void test() throws Exception {
        mockMvc.perform(get("/other")).andDo(MockMvcResultHandlers.print())
                .andExpect(status().is(200));
    }
}
