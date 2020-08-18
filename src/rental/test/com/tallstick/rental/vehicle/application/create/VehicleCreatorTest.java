package com.tallstick.rental.vehicle.application.create;

import com.tallstick.rental.vehicle.domain.Vehicle;
import com.tallstick.rental.vehicle.domain.VehicleId;
import com.tallstick.rental.vehicle.domain.VehicleName;
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

        VehicleCreatorRequest vehicleCreatorRequest = new VehicleCreatorRequest(
                "f0dc432f-5335-4b71-a883-bbd3959eb480",
                "OneName"
        );

        Vehicle vehicle = new Vehicle(
                new VehicleId(vehicleCreatorRequest.id()),
                new VehicleName(vehicleCreatorRequest.name())
        );

        vehicleCreator.create(vehicleCreatorRequest);

        verify(vehicleRepository,atLeastOnce()).save(vehicle);
    }

}