package org.example;

import java.time.LocalDateTime;

public class FixedClock implements Welcome.Clock {
    private final LocalDateTime fixedDateTime;

    public FixedClock(LocalDateTime fixedDateTime) {
        this.fixedDateTime = fixedDateTime;
    }

    @Override
    public LocalDateTime now() {
        return fixedDateTime;
    }
}

