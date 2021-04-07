package eu.codeacademy.module.exceptions;

public class SquareRootFromNegativeNumber extends RuntimeException{
    public SquareRootFromNegativeNumber() {
        super("ERROR: -N ROOT");
    }
}
