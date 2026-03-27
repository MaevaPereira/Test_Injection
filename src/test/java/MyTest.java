import org.example.FixedClock;
import org.example.Welcome;
import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyTest {

    @Test
    void testBonjourSimulation() {
        Welcome.Clock clock = new FixedClock(LocalDateTime.of(2026, 3, 27, 10, 0));
        Welcome welcome = new Welcome(clock);
        assertEquals("Bonjour!", welcome.getMessage());
    }

    @Test
    void testApremSimulation() {
        Welcome.Clock clock = new FixedClock(LocalDateTime.of(2026, 3, 27, 15, 0));
        Welcome welcome = new Welcome(clock);
        assertEquals("Bon après-midi", welcome.getMessage());
    }

    @Test
    void testBonsoirSimulation() {
        Welcome.Clock clock = new FixedClock(LocalDateTime.of(2026, 3, 26, 22, 0));
        Welcome welcome = new Welcome(clock);
        assertEquals("Bonsoir", welcome.getMessage());
    }

    @Test
    void testWeekEndSimulation() {
        Welcome.Clock clock = new FixedClock(LocalDateTime.of(2026, 3, 29, 10, 0));
        Welcome welcome = new Welcome(clock);
        assertEquals("Bon week-end", welcome.getMessage());
    }

    @Test
        void testBonjour() {
            org.example.Welcome welcome = new org.example.Welcome();
            assertEquals("Bonjour!", welcome.getMessage());
        } //test fail car il s'attend à "Bonjour!" mais en réalité c'est "Bonsoir" car il lit l'heure réelle du pc (20h)

}
