package eu.codeacademy.service;

import eu.codeacademy.module.CalculatorUsageDateTracker;

import java.io.File;

public class Calculator {
    public static void run(){
//        Calculation calculations = new Calculation("","");
//        Calculation calculations1 = new Calculation("12","112");
        CalculatorUsageDateTracker calculatorUsageDateTracker = new CalculatorUsageDateTracker();
//        calculatorUsageDateTracker.addCalculation(calculations);
//        calculatorUsageDateTracker.addCalculation(calculations1);
//        Map<String,List<Calculation>> map = calculatorUsageDateTracker.mapping(calculatorUsageDateTracker.getDate(),calculatorUsageDateTracker.getCalculations());
//        calculatorUsageDateTracker.addMapToFile(map);

        System.out.println(calculatorUsageDateTracker.moveFileToMap(new File("calculatorusagehistory.txt")).toString());
    }
}
