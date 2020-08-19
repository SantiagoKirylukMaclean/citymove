package com.tallstick.rental.vehicle;

import com.tallstick.rental.vehicle.infrastructure.InMemoryVehicleRepository;
import com.tallstick.shared.infrastructure.InfrastructureTestCase;
import org.springframework.beans.factory.annotation.Autowired;

public class VehicleRepositoryInfrastructureTestCase extends InfrastructureTestCase {
    @Autowired
    protected InMemoryVehicleRepository inMemoryVehicleRepository;
}
