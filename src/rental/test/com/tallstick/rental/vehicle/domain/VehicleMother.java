package com.tallstick.rental.vehicle.domain;

import com.tallstick.rental.vehicle.application.create.VehicleCreatorRequest;

public final class VehicleMother {
    public static Vehicle create(VehicleId id, VehicleName name) {
        return new Vehicle(id, name);
    }

    public static Vehicle fromRequest(VehicleCreatorRequest request) {
        return create(
                VehicleIdMother.create(request.id()),
                VehicleNameMother.create(request.name())
        );
    }

    public static Vehicle random() {
        return create(VehicleIdMother.random(), VehicleNameMother.random());
    }

}
