package com.ics.network.client.app.model;

public class Result {
    Input  input;
    double result;

    public Result(final Input input, final double result) {
        this.input = input;
        this.result = result;
    }

    public Input getInput() {
        return this.input;
    }

    public void setInput(final Input input) {
        this.input = input;
    }

    public double getResult() {
        return this.result;
    }

    public void setResult(final long result) {
        this.result = result;
    }
}
