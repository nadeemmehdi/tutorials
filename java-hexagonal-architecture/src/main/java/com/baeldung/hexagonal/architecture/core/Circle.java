package com.baeldung.hexagonal.architecture.core;

public class Circle {

    private Double radius;

    public Circle(Double radius) {
        super();
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }
}
