package com.ics.network.client.app.service;

import com.ics.network.client.app.exception.DivisionByZeroException;
import com.ics.network.client.app.model.Input;
import com.ics.network.client.app.model.Result;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class CalculationsServiceImpl implements CalculationsService {
    private static final Logger LOGGER = LoggerFactory.getLogger(CalculationsServiceImpl.class);

    /**
     *
     * @param input
     * @return
     */
    @Override
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
    public Result divide(final Input input) {
        if (input.getSecondNumber() == 0) {
            LOGGER.error("Error in division function with inputs firstNumber is {} and secondNumber is {} ",
                         input.getFirstNumber(),
                         input.getSecondNumber());
            throw new DivisionByZeroException("SecondNumber must not be zero");
        }
        final double res = input.getFirstNumber() / (double) input.getSecondNumber();
        return new Result(input, res);
    }
}
