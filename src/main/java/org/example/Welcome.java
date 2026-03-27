package org.example;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class Welcome {
    private final Clock clock;

    public interface Clock {
        LocalDateTime now();
    }

// Constructeur avec injection — utilisé aussi par les tests
    public Welcome(Clock clock) {
        this.clock = clock;
    }

// Constructeur par défaut — utilise l'horloge système réelle
    public Welcome() {
        this(new SystemClock());
    }

    public String getMessage() {
        LocalDateTime now = clock.now(); // ← On utilise l'abstraction
        int hour = now.getHour();
        DayOfWeek day = now.getDayOfWeek();

        if (day == DayOfWeek.MONDAY || day == DayOfWeek.TUESDAY || day == DayOfWeek.WEDNESDAY || day == DayOfWeek.THURSDAY || day == DayOfWeek.FRIDAY) {
            if (hour >= 9 && hour < 13) {
                return "Bonjour!";
            }
            if (hour >= 13 && hour < 18) {
                return "Bon après-midi";
            }
        }
        if (day == DayOfWeek.MONDAY) {
            if (hour < 9) {
                return "Bon week-end";
            }
        }
        if (day == DayOfWeek.FRIDAY){
            if (hour >= 18) {
                return "Bon week-end";
            }
        }

        if (day == DayOfWeek.MONDAY || day == DayOfWeek.TUESDAY || day == DayOfWeek.WEDNESDAY || day == DayOfWeek.THURSDAY) {
            if (hour >= 18 || hour < 9) {
                return "Bonsoir";
            }
        }
        if (day == DayOfWeek.SATURDAY || day == DayOfWeek.SUNDAY){
            return "Bon week-end";
        }
        return "";
    }
}