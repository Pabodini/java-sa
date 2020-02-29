package com.amanda.sample;

public class Sensor {

    private String name;
    private double value;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Sensor{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }

    public Sensor() {
    }

    public Sensor(String name, double value) {
        this.name = name;
        this.value = value;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
