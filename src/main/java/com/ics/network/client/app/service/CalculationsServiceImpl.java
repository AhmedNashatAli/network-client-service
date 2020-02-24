package com.ics.network.client.app.service;

import com.ics.network.client.app.exception.DivisionByZeroException;
import com.ics.network.client.app.model.Input;
import com.ics.network.client.app.model.Result;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class CalculationsServiceImpl implements CalculationsService {
    /**
     *
     * @param input
     * @return
     */
    @Override
    @Async("asyncExecutor")
    public Result multiply(final Input input) {
        final double res = input.getFirstNumber() * input.getSecondNumber();
        return new Result(input, res);
    }

    /**
     *
     * @param input
     * @return
     */
    @Override
    @Async("asyncExecutor")
    public Result add(final Input input) {
        final double res = input.getFirstNumber() + input.getSecondNumber();
        return new Result(input, res);
    }

    /**
     *
     * @param input
     * @return
     */
    @Override
    @Async("asyncExecutor")
    public Result divide(final Input input) {
        if (input.getSecondNumber() == 0) { throw new DivisionByZeroException("SecondNumber must not be zero"); }
        final double res = input.getFirstNumber() / (double) input.getSecondNumber();
        return new Result(input, res);
    }
}
