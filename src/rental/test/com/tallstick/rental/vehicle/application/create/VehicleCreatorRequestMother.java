package com.tallstick.rental.vehicle.application.create;

import com.tallstick.rental.vehicle.domain.VehicleIdMother;
import com.tallstick.rental.vehicle.domain.VehicleNameMother;
import com.tallstick.rental.vehicle.domain.VehicleId;
import com.tallstick.rental.vehicle.domain.VehicleName;

public final class VehicleCreatorRequestMother {

    public static VehicleCreatorRequest create(VehicleId id, VehicleName vehicleName){
        return new VehicleCreatorRequest(id.value(), vehicleName.Value());
    }

    public static VehicleCreatorRequest random(){
        return create(VehicleIdMother.random(), VehicleNameMother.random());
    }


}
