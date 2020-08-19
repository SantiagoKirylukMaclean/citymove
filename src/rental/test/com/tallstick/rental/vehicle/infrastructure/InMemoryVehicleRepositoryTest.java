package com.tallstick.rental.vehicle.infrastructure;

import com.tallstick.rental.vehicle.VehicleRepositoryInfrastructureTestCase;
import com.tallstick.rental.vehicle.domain.VehicleIdMother;
import com.tallstick.rental.vehicle.domain.VehicleMother;
import com.tallstick.rental.vehicle.domain.Vehicle;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Optional;

final class InMemoryVehicleRepositoryTest extends VehicleRepositoryInfrastructureTestCase {

    @Test
    void saveValidVehicle(){
        //InMemoryVehicleRepository repository = new InMemoryVehicleRepository();

        Vehicle vehicle = VehicleMother.random();

        inMemoryVehicleRepository.save(vehicle);
    }

    @Test
    void searchExistingVehicle(){
        //InMemoryVehicleRepository repository = new InMemoryVehicleRepository();

        Vehicle vehicle =  VehicleMother.random();
        inMemoryVehicleRepository.save(vehicle);

        Assert.assertEquals(Optional.of(vehicle),inMemoryVehicleRepository.search(vehicle.id()));
    }

    @Test
    void searchNonExistingVehicle(){
        //InMemoryVehicleRepository repository = new InMemoryVehicleRepository();

        Vehicle vehicle = VehicleMother.random();
        inMemoryVehicleRepository.save(vehicle);

        Assert.assertFalse(inMemoryVehicleRepository.search(VehicleIdMother.random()).isPresent());
    }
}