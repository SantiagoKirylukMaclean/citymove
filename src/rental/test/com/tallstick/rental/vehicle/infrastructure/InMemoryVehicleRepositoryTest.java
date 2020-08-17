package com.tallstick.rental.vehicle.infrastructure;

import com.tallstick.rental.vehicle.domain.Vehicle;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

final class InMemoryVehicleRepositoryTest {
    @Test
    void saveValidVehicle() throws Exception{
        InMemoryVehicleRepository repository = new InMemoryVehicleRepository();

        repository.save(new Vehicle("OneId","OneName"));
    }

    @Test
    void searchExistingVehicle(){
        InMemoryVehicleRepository repository = new InMemoryVehicleRepository();

        Vehicle vehicle = new Vehicle("OneId","OneName");
        repository.save(vehicle);

        Assert.assertEquals(Optional.of(vehicle),repository.search(vehicle.id()));
    }

    @Test
    void searchNonExistingVehicle(){
        InMemoryVehicleRepository repository = new InMemoryVehicleRepository();

        Vehicle vehicle = new Vehicle("OneId","OneName");
        repository.save(vehicle);

        Assert.assertFalse(repository.search("OtherCourse").isPresent());
    }
}