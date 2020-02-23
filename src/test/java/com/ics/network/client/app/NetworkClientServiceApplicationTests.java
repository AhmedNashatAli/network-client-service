package com.ics.network.client.app;

import com.ics.network.client.app.controller.CalculationController;

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
    private CalculationController calculationController;

    @Test
    public void contextLoads() {
        assertThat(this.calculationController).isNotNull();
    }

}
