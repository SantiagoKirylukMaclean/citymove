package com.tallstick.rental.vehicle;

import com.tallstick.rental.vehicle.domain.VehicleRepository;
import org.junit.jupiter.api.BeforeEach;

import static org.mockito.Mockito.*;

public class VehicleRepositoryUnitTestCase {
    protected VehicleRepository vehicleRepository;

    @BeforeEach
    protected void setUp() {
        vehicleRepository = mock(VehicleRepository.class);
    }
}
