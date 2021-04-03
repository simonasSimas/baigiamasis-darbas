package eu.codeacademy.module;

import eu.codeacademy.service.AddToFile;
import eu.codeacademy.service.MappingOutUsages;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CalculatorUsageDateTracker extends AddToFile implements MappingOutUsages {
    private List<Calculation> calculations = new ArrayList<>();
    private final String date = "" + LocalDate.now();


    public void addCalculation(Calculation calculation){
        calculations.add(calculation);
    }

    @Override
    public Map<String, List<Calculation>> mapping(String date, List<Calculation> list) {
        Map<String, List<Calculation>> mapping = new HashMap<>();
        mapping.put(date,list);
        return mapping;
    }

    public String getDate() {
        return date;
    }

    public List<Calculation> getCalculations() {
        return calculations;
    }
}