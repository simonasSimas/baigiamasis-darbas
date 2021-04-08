package eu.codeacademy.service;

import eu.codeacademy.module.Calculation;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorUsageDateTrackerImplTest {

//    private Calculation calculation(){
//        CalculatorUsageDateTrackerImpl calculatorUsageDateTracker =
//        return new CalculatorUsageDateTrackerImpl().getDate()
//    }

    @Test
    void mapping_returnTrueTest() {
        //given
        Calculation calculation = new Calculation("2+2","4");
        Calculation calculation1 = new Calculation("3*3","9");
        List<Calculation> list = new ArrayList<>();
        list.add(calculation);
        list.add(calculation1);
        CalculatorUsageDateTrackerImpl calculatorUsageDateTracker = new CalculatorUsageDateTrackerImpl();
        //when
        Map<String, List<Calculation>> map = calculatorUsageDateTracker.mapping(LocalDate.now()+"",list);
        //then
        assertEquals("2+2",map.get("2021-04-07").get(0).getFunction());
    }
}