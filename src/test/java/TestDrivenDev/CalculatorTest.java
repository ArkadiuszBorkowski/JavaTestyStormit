package TestDrivenDev;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.spy;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = spy(new Calculator());
    }

    @Test
    public void testDodawanie() throws Exception {
        assertEquals(5, calculator.oblicz(2, '+', 3), 0.001);
    }

    @Test
    public void testOdejmowanie() throws Exception {
        assertEquals(2, calculator.oblicz(5, '-', 3), 0.001);
    }

    @Test
    public void testMnozenie() throws Exception {
        assertEquals(15, calculator.oblicz(3, '*', 5), 0.001);
    }

    @Test
    public void testDzielenie() throws Exception {
        assertEquals(2, calculator.oblicz(6, '/', 3), 0.001);
    }

    @Test
    public void testDzieleniePrzezZero() throws Exception {
        calculator.oblicz(10, '/', 0);
    }
}