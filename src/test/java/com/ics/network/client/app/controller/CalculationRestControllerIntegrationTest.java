package com.ics.network.client.app.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@SpringBootTest
@AutoConfigureMockMvc
public class CalculationRestControllerIntegrationTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void multiply_test()
            throws Exception {
        this.mockMvc.perform(post("/multiply")
                                     .contentType(MediaType.APPLICATION_JSON)
                                     .content("{ \"firstNumber\": 10, \"secondNumber\": 200}"))
                    .andExpect(status().isOk())
                    .andExpect(jsonPath("$.result", is(2000.0)));
    }

    @Test
    public void multiplyBadInput_test()
            throws Exception {
        this.mockMvc.perform(post("/multiply")
                                     .contentType(MediaType.APPLICATION_JSON)
                                     .content("{ \"firstNumber\": 10, \"secondNumber\":\"number\" }"))
                    .andExpect(status().isOk())
                    .andExpect(jsonPath("$.error", containsString("not a valid Integer value")));
    }

    @Test
    public void add_test()
            throws Exception {
        this.mockMvc.perform(post("/add")
                                     .contentType(MediaType.APPLICATION_JSON)
                                     .content("{ \"firstNumber\": 10, \"secondNumber\": 10}"))
                    .andExpect(status().isOk())
                    .andExpect(jsonPath("$.result", is(20.0)));
    }


    @Test
    public void divide_test()
            throws Exception {
        this.mockMvc.perform(post("/divide")
                                     .contentType(MediaType.APPLICATION_JSON)
                                     .content("{ \"firstNumber\": 20, \"secondNumber\": 10}"))
                    .andExpect(status().isOk())
                    .andExpect(jsonPath("$.result", is(2.0)));
    }

    @Test
    public void divideByZero_test()
            throws Exception {
        this.mockMvc.perform(post("/divide")
                                     .contentType(MediaType.APPLICATION_JSON)
                                     .content("{ \"firstNumber\": 20, \"secondNumber\": 0}"))
                    .andExpect(status().isBadRequest())
                    .andExpect(jsonPath("$.error", is("SecondNumber must not be zero")));
    }
}
