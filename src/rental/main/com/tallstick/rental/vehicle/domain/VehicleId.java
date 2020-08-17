package com.tallstick.rental.vehicle.domain;

import com.tallstick.shared.domain.UuidIdentifier;

import java.util.UUID;

public class VehicleId extends UuidIdentifier {

    public VehicleId(String value) {
        super(value);
    }
}
