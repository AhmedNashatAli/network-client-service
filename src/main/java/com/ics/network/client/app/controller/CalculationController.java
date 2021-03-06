package com.ics.network.client.app.controller;

import com.ics.network.client.app.model.Input;
import com.ics.network.client.app.model.Result;
import com.ics.network.client.app.service.CalculationsService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api(value = "Calculations On Numbers")
@RestController
public class CalculationController {
    private static final Logger LOGGER = LoggerFactory.getLogger(CalculationController.class);
    @Autowired
    CalculationsService calculationsService;

    @ApiOperation(value = "Multiply 2 numbers",
                  response = Result.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200,
                         message = "Successfully retrieved the result of multiplication of the 2 numbers"),
            @ApiResponse(code = 400,
                         message = "The input are not right")
    })
    @PostMapping("/multiply")
    public Result multiply(@RequestBody final Input input) {
        LOGGER.info("CalculationController  multiply operation with inputs firstNumber is {} and secondNumber is {} ",
                    input.getFirstNumber(),
                    input.getSecondNumber());
        return this.calculationsService.multiply(input);
    }

    @ApiOperation(value = "Add 2 numbers",
                  response = Result.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200,
                         message = "Successfully retrieved the result of addition of the 2 numbers"),
            @ApiResponse(code = 400,
                         message = "The input are not right")
    })
    @PostMapping("/add")
    public Result add(@RequestBody final Input input) {

        LOGGER.info("CalculationController  add operation with inputs firstNumber is {} and secondNumber is {} ",
                    input.getFirstNumber(),
                    input.getSecondNumber());
        return this.calculationsService.add(input);
    }

    @ApiOperation(value = "Divide 2 numbers",
                  response = Result.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200,
                         message = "Successfully retrieved the result of division of the 2 numbers"),
            @ApiResponse(code = 400,
                         message = "The input are not right")
    })
    @PostMapping("/divide")
    public Result divide(@RequestBody final Input input) {
        LOGGER.info("CalculationController  divide operation with inputs firstNumber is {} and secondNumber is {} ",
                    input.getFirstNumber(),
                    input.getSecondNumber());
        return this.calculationsService.divide(input);
    }
}