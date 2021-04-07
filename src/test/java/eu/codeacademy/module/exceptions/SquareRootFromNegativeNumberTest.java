package eu.codeacademy.module.exceptions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareRootFromNegativeNumberTest {
    @Test
    void whenSquareRootFromNeagtiveNumber_thenAssertionSucceeds(){
        int a = -1;
        SquareRootFromNegativeNumber squareRootFromNegativeNumber = assertThrows(SquareRootFromNegativeNumber.class, () ->{
            if (a >0){
                Math.sqrt(a);
            } else {
                throw new SquareRootFromNegativeNumber();
            }
        });

        String expectedMessage = "ERROR: -N ROOT";
        String actualMessage = squareRootFromNegativeNumber.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

}