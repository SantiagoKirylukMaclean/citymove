package com.tallstick.rental.vehicle.domain;

import com.tallstick.rental.vehicle.domain.VehicleName;
import com.tallstick.shared.domain.WordMother;

public final class VehicleNameMother {

    public static VehicleName create(String value) {
        return new VehicleName(value);
    }

    public static VehicleName random() {
        return create(WordMother.random());
    }
}
