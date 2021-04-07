package eu.codeacademy.module.exceptions;

public class DivisionByZero extends RuntimeException {
    public DivisionByZero() {
        super("ERROR: DIV BY 0");
    }
}
