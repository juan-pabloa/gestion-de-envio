package org.example.domain.utilities;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NumberPrimoServiceTest {

    private final NumberPrimoService service = new NumberPrimoService();

    @Test
    void shouldReturnTrueForTwo() {

        assertTrue(service.esPrimo(2));
    }

    @Test
    void shouldReturnTrueForThree() {
        assertTrue(service.esPrimo(3));
    }

    @Test
    void shouldReturnTrueForFive() {
        assertTrue(service.esPrimo(5));
    }

    @Test
    void shouldReturnTrueForSeven() {
        assertTrue(service.esPrimo(7));
    }

    @Test
    void shouldReturnTrueForEleven() {
        assertTrue(service.esPrimo(11));
    }

    @Test
    void shouldReturnTrueForThirteen() {
        assertTrue(service.esPrimo(13));
    }

    @Test
    void shouldReturnTrueForSeventeen() {
        assertTrue(service.esPrimo(17));
    }

    @Test
    void shouldReturnTrueForTwentyThree() {
        assertTrue(service.esPrimo(23));
    }

    @Test
    void shouldReturnTrueForTwentyNine() {
        assertTrue(service.esPrimo(29));
    }

    @Test
    void shouldReturnTrueForThirtyOne() {
        assertTrue(service.esPrimo(31));
    }

    @Test
    void shouldReturnFalseForZero() {
        assertFalse(service.esPrimo(0));
    }

    @Test
    void shouldReturnFalseForOne() {
        assertFalse(service.esPrimo(1));
    }

    @Test
    void shouldReturnFalseForFour() {
        assertFalse(service.esPrimo(4));
    }

    @Test
    void shouldReturnFalseForSix() {
        assertFalse(service.esPrimo(6));
    }

    @Test
    void shouldReturnFalseForEight() {
        assertFalse(service.esPrimo(8));
    }

    @Test
    void shouldReturnFalseForNine() {
        assertFalse(service.esPrimo(9));
    }

    @Test
    void shouldReturnFalseForTen() {
        assertFalse(service.esPrimo(10));
    }

    @Test
    void shouldReturnFalseForFifteen() {
        assertFalse(service.esPrimo(15));
    }

    @Test
    void shouldReturnFalseForTwentyOne() {
        assertFalse(service.esPrimo(21));
    }

    @Test
    void shouldReturnFalseForTwentyFive() {
        assertFalse(service.esPrimo(25));
    }

    @Test
    void shouldReturnFalseForTwentySeven() {
        assertFalse(service.esPrimo(27));
    }

    @Test
    void shouldReturnFalseForThirtyThree() {
        assertFalse(service.esPrimo(33));
    }

    @Test
    void shouldReturnFalseForNegativeOne() {
        assertFalse(service.esPrimo(-1));
    }

    @Test
    void shouldReturnFalseForNegativeTwo() {
        assertFalse(service.esPrimo(-2));
    }

    @Test
    void shouldReturnFalseForNegativeFive() {
        assertFalse(service.esPrimo(-5));
    }

}
