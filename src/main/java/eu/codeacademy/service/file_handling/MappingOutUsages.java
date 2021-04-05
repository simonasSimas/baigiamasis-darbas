package eu.codeacademy.service;

import eu.codeacademy.module.Calculation;

import java.util.List;
import java.util.Map;

public interface MappingOutUsages {
    Map<String, List<Calculation>> mapping(String date, List<Calculation> list);
}
