package com.tallstick.apps.rental.controller.vehicle;

import com.tallstick.rental.vehicle.application.create.VehicleCreator;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public final class VehiclePutController {

    private VehicleCreator vehicleCreator;
    public VehiclePutController(VehicleCreator vehicleCreator) {
        this.vehicleCreator = vehicleCreator;
    }

    @PutMapping("/vehicle/{id}")
    public ResponseEntity create(@PathVariable String id, @RequestBody Request request){
        vehicleCreator.create(id, request.name());
        return new ResponseEntity(HttpStatus.CREATED);
    }


}

final class Request{
    private String name;

    String name(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}
