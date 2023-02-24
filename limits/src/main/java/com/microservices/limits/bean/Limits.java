package com.microservices.limits.bean;

public class Limits {
    private int minimum;
    private int max;

    public Limits() {super();}

    public Limits(int minimum, int max) {
        super();
        this.minimum = minimum;
        this.max = max;
    }

    public int getMinimum() {
        return minimum;
    }

    public void setMinimum(int minimum) {
        this.minimum = minimum;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }
}
