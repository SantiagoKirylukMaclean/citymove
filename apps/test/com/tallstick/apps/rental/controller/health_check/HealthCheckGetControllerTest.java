package com.tallstick.apps.rental.controller.health_check;

import com.tallstick.apps.rental.controller.RequestTestCase;
import org.junit.jupiter.api.Test;


final class HealthCheckGetControllerTest extends RequestTestCase {

    @Test
    void checkHealthIsWorking() throws Exception{
        assertResponse("/health-check",200,"{'status':'ok'}");
    }

}