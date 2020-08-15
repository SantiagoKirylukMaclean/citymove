package com.tallstick.rental.vehicle.application.create;

import com.tallstick.rental.vehicle.domain.Vehicle;
import com.tallstick.rental.vehicle.domain.VehicleRepository;
import com.tallstick.shared.domain.Service;


@Service
public final class VehicleCreator {
    private VehicleRepository vehicleRepository;

    public VehicleCreator(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    public void create(String id, String name){

        Vehicle vehicle = new Vehicle(id,name);

        vehicleRepository.save(vehicle);
    }
}
