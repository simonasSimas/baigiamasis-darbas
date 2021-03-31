package eu.codeacademy.module;

import java.sql.Time;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Calculations {
    private String function;
    private String result;
    private final Time time =Time.valueOf(LocalTime.parse(LocalTime.now().format(DateTimeFormatter.ofPattern("H:mm:ss"))));

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

    public Time getTime() {
        return time;
    }

    @Override
    public String toString() {
        return
                "Function: " + function + '\n' +
                "Result: " + result + '\n' +
                "Calculation made at: " + time;
    }
}
