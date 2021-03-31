package eu.codeacademy.service;

import eu.codeacademy.module.Calculations;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public interface MappingOutUsages {
    Map<String, List<Calculations>> mapping(String date, List<Calculations> list);
}
