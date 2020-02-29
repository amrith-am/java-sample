package com.amrith.sample;

public class Sensors {
    private String name;
    private Double value;

    public Sensors() {
    }

    public Sensors(String name, Double value) {
        this.name = name;
        this.value = value;
    }

    public Sensors(String living_room, int i) {
    }

    public static void add(Sensors sensor2) {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
}
