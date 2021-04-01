package eu.codeacademy.module;

import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Calculations {
    private String function;
    private String result;
    private Time time =Time.valueOf(LocalTime.parse(LocalTime.now().format(DateTimeFormatter.ofPattern("H:mm:ss"))));

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

    public void setTime(String time) {
        DateFormat sdf = new SimpleDateFormat("hh:mm:ss");
        Date date = null;
        try {
            date = sdf.parse(time);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        this.time = new Time(date.getTime());
    }

    @Override
    public String toString() {
        return
                "Function: " + function + '\n' +
                "Result: " + result + '\n' +
                "Calculation made at: " + time;
    }
}
