package eu.codeacademy.module;

import java.time.LocalTime;

public class Calculations {
    private String function;
    private String result;
    private final LocalTime time = LocalTime.now();

    public Calculations(String function, String result) {
        this.function = function;
        this.result = result;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public LocalTime getTime() {
        return time;
    }
}
