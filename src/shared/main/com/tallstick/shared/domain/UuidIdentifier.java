package com.tallstick.shared.domain;

import java.util.Objects;
import java.util.UUID;

public abstract class UuidIdentifier {
    private String value;

    public UuidIdentifier(String value) {
        checkValueUUID(value);
        this.value = value;
    }

    private void checkValueUUID(String value) {
        UUID.fromString(value);
    }

    public String getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UuidIdentifier that = (UuidIdentifier) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
