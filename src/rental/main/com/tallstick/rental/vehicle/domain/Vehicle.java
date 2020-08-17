package com.tallstick.rental.vehicle.domain;

import java.util.Objects;

public class Vehicle {
    private String id;
    private String name;

    public Vehicle(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String id() {
        return id;
    }

    public String name() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return Objects.equals(id, vehicle.id) &&
                Objects.equals(name, vehicle.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
