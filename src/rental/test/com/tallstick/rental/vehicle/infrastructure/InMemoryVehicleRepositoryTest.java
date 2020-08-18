package com.tallstick.rental.vehicle.infrastructure;

import com.tallstick.rental.vehicle.domain.Vehicle;
import com.tallstick.rental.vehicle.domain.VehicleId;
import com.tallstick.rental.vehicle.domain.VehicleName;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

final class InMemoryVehicleRepositoryTest {
    @Test
    void saveValidVehicle() throws Exception{
        InMemoryVehicleRepository repository = new InMemoryVehicleRepository();



        repository.save(new Vehicle(
                new VehicleId("f0dc432f-5335-4b71-a883-bbd3959eb480"),
                new VehicleName("OneName"))
        );
    }

    @Test
    void searchExistingVehicle(){
        InMemoryVehicleRepository repository = new InMemoryVehicleRepository();

        Vehicle vehicle = new Vehicle(
                new VehicleId("f0dc432f-5335-4b71-a883-bbd3959eb480"),
                new VehicleName("OneName")
        );
        repository.save(vehicle);

        Assert.assertEquals(Optional.of(vehicle),repository.search(vehicle.id()));
    }

    @Test
    void searchNonExistingVehicle(){
        InMemoryVehicleRepository repository = new InMemoryVehicleRepository();

        Vehicle vehicle = new Vehicle(
                new VehicleId("f0dc432f-5335-4b71-a883-bbd3959eb480"),
                new VehicleName("OneName")
        );
        repository.save(vehicle);

        Assert.assertFalse(repository.search(new VehicleId("400182ad-c20e-4dd4-bdad-b19c34779da9")).isPresent());
    }
}