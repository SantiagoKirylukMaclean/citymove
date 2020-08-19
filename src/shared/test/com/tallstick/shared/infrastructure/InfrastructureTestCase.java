package com.tallstick.shared.infrastructure;

import com.tallstick.apps.Starter;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes = Starter.class)
@SpringBootTest
public abstract class InfrastructureTestCase {
}
