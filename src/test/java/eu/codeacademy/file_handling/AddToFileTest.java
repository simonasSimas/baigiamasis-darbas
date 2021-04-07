package eu.codeacademy.file_handling;

import eu.codeacademy.app_interface.run_app.CalculatorAppRuntime;
import eu.codeacademy.module.Calculation;
import eu.codeacademy.service.CalculatorUsageDateTrackerImpl;
import org.junit.After;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.*;

class AddToFileTest {

    @AfterEach
    private void resetFile() {
        Map<String, List<Calculation>> map = new HashMap<>();
        List<Calculation> list = new ArrayList<>();
        list.add(new Calculation("5 * 5 = 25.0", "25.0"));
        map.put("2021-04-06", list);
        new CalculatorUsageDateTrackerImpl().addMapToFile(map, new File("src/test/test/calculatorusagehistoryTest.txt"));
    }

    private Map<String, List<Calculation>> readyMap() {
        Map<String, List<Calculation>> map = new HashMap<>();
        List<Calculation> list = new ArrayList<>();
        list.add(new Calculation("2 + 3", "5.0"));
        map.put("" + LocalDate.now(), list);
        return map;
    }

    @Test
    void addMapToFile() {
        //given
        CalculatorUsageDateTrackerImpl calculatorUsageDateTracker = new CalculatorUsageDateTrackerImpl();
        Map<String, List<Calculation>> map = readyMap();
        //when
        calculatorUsageDateTracker.clearFile();
        calculatorUsageDateTracker.addMapToFile(map, new File("src/test/test/calculatorusagehistoryTest.txt"));
        //then

    }

    @Test
    void moveFileToMap() throws FileNotFoundException {
        //given
        CalculatorUsageDateTrackerImpl calculatorUsageDateTracker = new CalculatorUsageDateTrackerImpl();
        Scanner sc = new Scanner(new File("src/test/test/calculatorusagehistoryTest.txt"));
        //when
        Map<String, List<Calculation>> map = calculatorUsageDateTracker.moveFileToMap(new File("src/test/test/calculatorusagehistoryTest.txt"));
        //then
        assertEquals("25.0", map.get("2021-04-06").get(0).getResult());
    }
}