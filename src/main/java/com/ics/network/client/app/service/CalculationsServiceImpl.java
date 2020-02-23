package com.ics.network.client.app.service;

import com.ics.network.client.app.model.Input;
import com.ics.network.client.app.model.Result;

import org.springframework.stereotype.Service;

@Service
public class CalculationsServiceImpl implements CalculationsService {
    @Override
    public Result multiply(final Input input) {
        final long res = input.getFirstNumber() * input.getSecondNumber();
        return new Result(input, res);
    }

    @Override
    public Result add(final Input input) {
        final long res = input.getFirstNumber() + input.getSecondNumber();
        return new Result(input, res);
    }
}
