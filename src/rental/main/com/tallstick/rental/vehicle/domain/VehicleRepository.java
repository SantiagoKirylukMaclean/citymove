package com.tallstick.rental.vehicle.domain;

import java.util.Optional;

public interface VehicleRepository {
    void save(Vehicle vehicle);

    Optional<Vehicle> search(VehicleId id);

}
