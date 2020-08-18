package com.tallstick.rental.vehicle.domain;

import java.util.Objects;

public class Vehicle {
    private final VehicleId id;
    private final VehicleName vehicleName;


    public Vehicle(VehicleId id, VehicleName vehicleName) {
        this.id = id;
        this.vehicleName = vehicleName;
    }

    public VehicleId id() {
        return id;
    }

    public VehicleName name() {
        return vehicleName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return id.equals(vehicle.id) &&
                vehicleName.equals(vehicle.vehicleName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, vehicleName);
    }
}
