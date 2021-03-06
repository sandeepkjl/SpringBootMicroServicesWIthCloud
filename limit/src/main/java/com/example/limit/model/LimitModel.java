package com.example.limit.model;

import org.springframework.beans.factory.annotation.Value;

public class LimitModel {
    @Value("${min.value}")
    private int minValue;
    @Value("${max.value}")
    private int maxValue;

    public LimitModel() {
    }

    public LimitModel(int minValue, int maxValue) {
        this.minValue = minValue;
        this.maxValue = maxValue;
    }

    public int getMinValue() {
        return minValue;
    }

    public void setMinValue(int minValue) {
        this.minValue = minValue;
    }

    public int getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(int maxValue) {
        this.maxValue = maxValue;
    }

    @Override
    public String toString() {
        return "LimitModel{" +
                "minValue=" + minValue +
                ", maxValue=" + maxValue +
                '}';
    }
}
