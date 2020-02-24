package com.ics.network.client.app.service;

import com.ics.network.client.app.model.Input;
import com.ics.network.client.app.model.Result;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class CalculationsServiceImpl implements CalculationsService {
    @Override
    @Async("asyncExecutor")
    public Result multiply(final Input input) {
        final double res = input.getFirstNumber() * input.getSecondNumber();
        return new Result(input, res);
    }

    @Override
    @Async("asyncExecutor")
    public Result add(final Input input) {
        final double res = input.getFirstNumber() + input.getSecondNumber();
        return new Result(input, res);
    }

    @Override
    @Async("asyncExecutor")
    public Result divide(final Input input) {
        final double res = input.getFirstNumber() / input.getSecondNumber();
        return new Result(input, res);
    }
}
