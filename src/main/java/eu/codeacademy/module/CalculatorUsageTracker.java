package eu.codeacademy.module;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CalculatorUsageTracker {
    private List<Calculations> calculations = new ArrayList<>();
    private LocalDate date = LocalDate.now();


    public void addCalculation(Calculations calculation){
        calculations.add(calculation);
    }
}
