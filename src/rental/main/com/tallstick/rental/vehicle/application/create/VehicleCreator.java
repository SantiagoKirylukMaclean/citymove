package com.tallstick.rental.vehicle.application.create;

import com.tallstick.rental.vehicle.domain.Vehicle;
import com.tallstick.rental.vehicle.domain.VehicleId;
import com.tallstick.rental.vehicle.domain.VehicleName;
import com.tallstick.rental.vehicle.domain.VehicleRepository;
import com.tallstick.shared.domain.Service;

@Service
public final class VehicleCreator {
    private VehicleRepository vehicleRepository;

    public VehicleCreator(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    public void create(VehicleCreatorRequest request){

        Vehicle vehicle = new Vehicle(
                new VehicleId(request.id()),
                new VehicleName(request.name())
        );

        vehicleRepository.save(vehicle);
    }
}
