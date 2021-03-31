package eu.codeacademy.module;

import eu.codeacademy.service.MappingOutUsages;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CalculatorUsageDateTracker implements MappingOutUsages {
    private List<Calculations> calculations = new ArrayList<>();
    private LocalDate date = LocalDate.now();


    public void addCalculation(Calculations calculation){
        calculations.add(calculation);
    }

    @Override
    public Map<LocalDate, List<Calculations>> mapping(LocalDate date, List<Calculations> list) {
        Map<LocalDate, List<Calculations>> mapping = new HashMap<>();
        mapping.put(date,list);
        return mapping;
    }
}