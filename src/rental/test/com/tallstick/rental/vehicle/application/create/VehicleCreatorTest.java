package com.tallstick.rental.vehicle.application.create;

import com.tallstick.rental.vehicle.domain.Vehicle;
import com.tallstick.rental.vehicle.domain.VehicleRepository;
import org.junit.jupiter.api.Test;


import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

final class VehicleCreatorTest {
    @Test
    void saveValidVehicle() throws Exception{
        VehicleRepository vehicleRepository = mock(VehicleRepository.class);
        VehicleCreator vehicleCreator = new VehicleCreator(vehicleRepository);

        Vehicle vehicle = new Vehicle("oneId","oneName");

        vehicleCreator.create(new VehicleCreatorRequest(vehicle.id(),vehicle.name()));

        verify(vehicleRepository,atLeastOnce()).save(vehicle);
    }

}