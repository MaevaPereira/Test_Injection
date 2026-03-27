package org.example;

import java.time.LocalDateTime;

public class SystemClock implements Welcome.Clock {

    @Override
    public LocalDateTime now() {
        return LocalDateTime.now();
    }
}
