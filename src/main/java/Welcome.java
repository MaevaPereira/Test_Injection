import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class Welcome {
    public String getMessage() {
        LocalDateTime dateTime = LocalDateTime.now();
        DayOfWeek day = dateTime.getDayOfWeek();

        int hour = dateTime.getHour();
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