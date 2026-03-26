import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyTest {

    @Test
    void testBonjour() {
        Welcome welcome = new Welcome();
        assertEquals("Bonjour!", welcome.getMessage());
    } //test fail car il s'attend à "Bonjour!" mais en réalité c'est "Bonsoir" car il lit l'heure réelle du pc (20h)





}
