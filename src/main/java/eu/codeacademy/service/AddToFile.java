package eu.codeacademy.service;

import eu.codeacademy.module.Calculation;

import java.io.*;
import java.util.*;

public abstract class AddToFile {

    public void addMapToFile(Map<String, List<Calculation>> map) {
        PrintWriter pw = write();
        List<String> listOfDates = new ArrayList<>(map.keySet());
        int functionNumber = 1;
        for (String s : listOfDates) {
            pw.println("Date: " + s);
            pw.println("List of calculations: ");
            for (Calculation calculation : map.get(s)) {
                pw.println(functionNumber + ".");
                pw.println("Function: " + calculation.getFunction());
                pw.println("Result: " + calculation.getResult());
                pw.println("Calculation made at: " + calculation.getTime());
                functionNumber++;
            }
            pw.println("<-------------->");
            pw.close();
        }
    }

    private PrintWriter write() {
        FileWriter fw = null;
        try {
            fw = new FileWriter("calculatorusagehistory.txt", true);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return new PrintWriter(fw);
    }

    public Map<String, List<Calculation>> moveFileToMap(File file) {
        Scanner sc = fileScanner(file);
        List<Calculation> listOfCalculations = new ArrayList<>();
        Map<String, List<Calculation>> mapOfFile = new HashMap<>();
        while (sc.hasNextLine()) {
            listOfCalculations.clear();
            String dateFromFile = sc.nextLine().substring(6);
            sc.nextLine();
            while (true) {
                if (sc.nextLine().equals("<-------------->")) {
                    break;
                } else {
                    String function = sc.nextLine().substring(9);
                    String result = sc.nextLine().substring(7);
                    String time = sc.nextLine().substring(21);
                    Calculation calculation = new Calculation();
                    calculation.setFunction(function);
                    calculation.setResult(result);
                    calculation.setTime(time);
                    listOfCalculations.add(calculation);
                }
            }
            mapOfFile.put(dateFromFile, listOfCalculations);
        }

        return mapOfFile;

    }

    private Scanner fileScanner(File file) {
        Scanner sc = null;
        try {
            sc = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return sc;
    }
}
