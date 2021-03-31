package eu.codeacademy.service;

import eu.codeacademy.module.Calculations;
import eu.codeacademy.module.CalculatorUsageDateTracker;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class Calculator {
    public static void run(){
        Calculations calculations = new Calculations("","");
        Calculations calculations1 = new Calculations("12","112");
        CalculatorUsageDateTracker calculatorUsageDateTracker = new CalculatorUsageDateTracker();
        calculatorUsageDateTracker.addCalculation(calculations);
        calculatorUsageDateTracker.addCalculation(calculations1);
        Map<String,List<Calculations>> map = calculatorUsageDateTracker.mapping(calculatorUsageDateTracker.getDate(),calculatorUsageDateTracker.getCalculations());
        calculatorUsageDateTracker.addMapToFile(map);
    }
}
