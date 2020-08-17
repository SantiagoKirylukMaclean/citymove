package com.tallstick.rental.vehicle.infrastructure;

import com.tallstick.rental.vehicle.domain.Vehicle;
import com.tallstick.rental.vehicle.domain.VehicleRepository;
import com.tallstick.shared.domain.Service;


import java.util.HashMap;
import java.util.Optional;

@Service
public final class InMemoryVehicleRepository implements VehicleRepository {
    private HashMap<String,Vehicle> vehicles = new HashMap<>();

    @Override
    public void save(Vehicle vehicle) {
        this.vehicles.put(vehicle.id(),vehicle);
    }

    @Override
    public Optional<Vehicle> search(String id) {
        return Optional.ofNullable(vehicles.get(id));
    }
}
