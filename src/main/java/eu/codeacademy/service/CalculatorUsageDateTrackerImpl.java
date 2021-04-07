package eu.codeacademy.service;

import eu.codeacademy.file_handling.AddToFile;
import eu.codeacademy.module.Calculation;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CalculatorUsageDateTrackerImpl extends AddToFile implements CalculatorUsageDateTracker {
    private final List<Calculation> calculations = new ArrayList<>();
    private final String date = "" + LocalDate.now();

    @Override
    public Map<String, List<Calculation>> mapping(String date, List<Calculation> list) {
        Map<String, List<Calculation>> mapping = new HashMap<>();
        mapping.put(date,list);
        return mapping;
    }

    @Override
    public String getDate() {
        return date;
    }

    @Override
    public List<Calculation> getCalculations() {
        return calculations;
    }
}