package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculationTest {
    @Test
    void add() {
        Calculation c = new Calculation();
        assertEquals(c.Add(5, 4), 9);
    }
}
