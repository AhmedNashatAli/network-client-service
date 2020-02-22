package com.ics.network.networkclientservice.modle;

public class Multiply {
    private final int  a;
    private final int  b;
    private       long result;


    public Multiply(final int a, final int b) {
        this.a = a;
        this.b = b;
    }

    public long getResult() {
        return this.a * this.b;
    }

    public int getA() {
        return this.a;
    }

    public int getB() {
        return this.b;
    }
}
