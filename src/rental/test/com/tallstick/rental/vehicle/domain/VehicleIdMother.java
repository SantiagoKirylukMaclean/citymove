package com.tallstick.rental.vehicle.domain;

import com.tallstick.rental.vehicle.domain.VehicleId;
import com.tallstick.shared.domain.UuidMother;

public final class VehicleIdMother {
    public static VehicleId create(String value) {
        return new VehicleId(value);
    }

    public static VehicleId random() {
        return create(UuidMother.random());
    }
}
