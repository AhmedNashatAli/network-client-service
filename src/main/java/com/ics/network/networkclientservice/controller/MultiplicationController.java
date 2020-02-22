package com.ics.network.networkclientservice.controller;

import com.ics.network.networkclientservice.modle.Multiply;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/v1/multiply")
public class MultiplicationController {

    @GetMapping("")
    public Multiply multiply(@RequestParam(value = "a",
                                           defaultValue = "0") final int a, @RequestParam(value = "b",
                                                                                          defaultValue = "0")
                             final int b) {
        return new Multiply(a, b);
    }
}