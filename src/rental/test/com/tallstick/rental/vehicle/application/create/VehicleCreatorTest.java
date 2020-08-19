package com.tallstick.rental.vehicle.application.create;


import com.tallstick.rental.vehicle.VehicleRepositoryUnitTestCase;
import com.tallstick.rental.vehicle.domain.VehicleMother;
import com.tallstick.rental.vehicle.domain.Vehicle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

final class VehicleCreatorTest extends VehicleRepositoryUnitTestCase {
    VehicleCreator vehicleCreator;

    @BeforeEach
    protected void setUp(){
        super.setUp();

        vehicleCreator = new VehicleCreator(vehicleRepository);
    }

    @Test
    void saveValidVehicle(){
        //VehicleRepository vehicleRepository = mock(VehicleRepository.class);
        //VehicleCreator vehicleCreator = new VehicleCreator(vehicleRepository);

        VehicleCreatorRequest vehicleCreatorRequest = VehicleCreatorRequestMother.random();

        Vehicle vehicle = VehicleMother.fromRequest(vehicleCreatorRequest);

        vehicleCreator.create(vehicleCreatorRequest);

        verify(vehicleRepository,atLeastOnce()).save(vehicle);
    }

}