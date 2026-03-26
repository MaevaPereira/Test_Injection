import org.junit.jupiter.api.Test;
import java.time.Clock;
import java.time.ZoneId;
import java.time.ZonedDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyTest {

@Test
    void testBonjour() {
        Welcome welcome = new Welcome();
        assertEquals("Bonjour!", welcome.getMessage());
    } //test fail car il s'attend à "Bonjour!" mais en réalité c'est "Bonsoir" car il lit l'heure réelle du pc (20h)

@Test
    void testBonjourSimulation() {
        ZonedDateTime time = ZonedDateTime.of(2026, 3, 26, 10, 0, 0,0,ZoneId.systemDefault());
        Clock clock = Clock.fixed(time.toInstant(), ZoneId.systemDefault());
        Welcome fakeClock = new Welcome(clock);
        assertEquals("Bonjour!", fakeClock.getMessage());
    }// Test réussi
}
