package com.ics.network.networkclientservice;

import com.ics.network.networkclientservice.controller.MultiplicationController;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class NetworkClientServiceApplicationTests {
    @Autowired
    private MultiplicationController multiplicationController;

    @Test
    public void contextLoads() {
        assertThat(this.multiplicationController).isNotNull();
    }

}
