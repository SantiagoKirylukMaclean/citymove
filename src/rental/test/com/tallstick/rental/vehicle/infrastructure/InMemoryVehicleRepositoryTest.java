package com.tallstick.rental.vehicle.infrastructure;

import com.tallstick.rental.vehicle.domain.VehicleIdMother;
import com.tallstick.rental.vehicle.domain.VehicleMother;
import com.tallstick.rental.vehicle.domain.Vehicle;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Optional;

final class InMemoryVehicleRepositoryTest {
    @Test
    void saveValidVehicle() throws Exception{
        InMemoryVehicleRepository repository = new InMemoryVehicleRepository();

        Vehicle vehicle = VehicleMother.random();

        repository.save(vehicle);
    }

    @Test
    void searchExistingVehicle(){
        InMemoryVehicleRepository repository = new InMemoryVehicleRepository();

        Vehicle vehicle =  VehicleMother.random();
        repository.save(vehicle);

        Assert.assertEquals(Optional.of(vehicle),repository.search(vehicle.id()));
    }

    @Test
    void searchNonExistingVehicle(){
        InMemoryVehicleRepository repository = new InMemoryVehicleRepository();

        Vehicle vehicle = VehicleMother.random();
        repository.save(vehicle);

        Assert.assertFalse(repository.search(VehicleIdMother.random()).isPresent());
    }
}