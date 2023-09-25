import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TemperaturaTest {

    @Test
    public void testTemperaturasAcimaDaMedia() {
        assertEquals(1, Temperatura.diasAcimaDaMedia(new int[] { 2, 2, 2, 2, 2, 2, 3 }));
        assertEquals(3, Temperatura.diasAcimaDaMedia(new int[] { 21, 10, 13, 34, 30, 21, 34 }));
        assertEquals(6, Temperatura.diasAcimaDaMedia(new int[] { 2, 2, 2, 2, 2, 2, 1 }));
        assertEquals("Erro", Temperatura.diasAcimaDaMedia(new int[] { 2, 2, 2, 2, 2, 2, 50 }));
        assertEquals("Erro", Temperatura.diasAcimaDaMedia(new int[] { -1, 2, 2, 2, 2, 2, 3 }));
    }
}
