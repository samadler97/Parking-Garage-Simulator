package com.company;

public class Vehicle {

    private boolean taken;
    private String type;

    public Vehicle (boolean taken, String type) {

        this.taken = taken;
        this.type = type;

    }

    public void setTaken(boolean taken) {
        this.taken = taken;
    }

    public boolean getTaken() {
        return taken;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}