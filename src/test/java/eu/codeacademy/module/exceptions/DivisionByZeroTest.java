package eu.codeacademy.module.exceptions;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class DivisionByZeroTest {
    int a = 2;
    int d = new Random().nextInt(2);
    @Test
    void whenDivisonByZeroIsThrown_thenAssertionSucceeds(){
        DivisionByZero division = assertThrows(DivisionByZero.class, () -> {
            if (d!=0) {
                int b = a / d;
            }else {
                throw  new DivisionByZero();
            }
        });

        String expectedMessage = "ERROR: DIV BY 0";
        String actualMessage = division.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }
}