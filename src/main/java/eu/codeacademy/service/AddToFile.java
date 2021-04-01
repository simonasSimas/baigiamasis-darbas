package eu.codeacademy.service;

import eu.codeacademy.module.Calculations;

import java.io.*;
import java.util.*;

public abstract class AddToFile {

    public void addMapToFile(Map<String, List<Calculations>> map) {
        PrintWriter pw = write();
        List<String> listOfDates = new ArrayList<>(map.keySet());
        int functionNumber = 1;
        for (String s : listOfDates) {
            pw.println("Date: " + s);
            pw.println("List of calculations: ");
            for (Calculations calculations : map.get(s)) {
                pw.println(functionNumber + ".");
                pw.println("Function: " + calculations.getFunction());
                pw.println("Result: " + calculations.getResult());
                pw.println("Calculation made at: " + calculations.getTime());
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

    public Map<String, List<Calculations>> moveFileToMap(File file) {
        Scanner sc = fileScanner(file);
        List<Calculations> listOfCalculations = new ArrayList<>();
        Map<String, List<Calculations>> mapOfFile = new HashMap<>();
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
                    Calculations calculations = new Calculations(function, result);
                    calculations.setTime(time);
                    listOfCalculations.add(calculations);
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
