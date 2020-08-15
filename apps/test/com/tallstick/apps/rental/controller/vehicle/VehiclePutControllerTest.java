package com.tallstick.apps.rental.controller.vehicle;

import com.tallstick.apps.rental.controller.RequestTestCase;
import org.junit.jupiter.api.Test;


final class VehiclePutControllerTest extends RequestTestCase {

    @Test
    void createValidVehicle() throws Exception{
        assertRequestWithBody(
                "PUT",
                "/vehicle/96a2682a-48ac-45f1-81e6-74f91d8e7d09",
                "{\"name\":\"Moto 1\"}",
                201);
    }
}
