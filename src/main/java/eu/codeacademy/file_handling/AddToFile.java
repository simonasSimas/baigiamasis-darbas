package eu.codeacademy.file_handling;

import eu.codeacademy.module.Calculation;

import java.io.*;
import java.util.*;

public abstract class AddToFile {

    public void addMapToFile(Map<String, List<Calculation>> map) {
        PrintWriter pw = write();
        List<String> listOfDates = new ArrayList<>(map.keySet());
        for (String s : listOfDates) {
            int functionNumber = 1;
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
        }
        pw.close();
    }

    private PrintWriter write() {
        File file = new File("calculatorusagehistory.txt");
        FileWriter fw = null;
        try {
            fw = new FileWriter(file, true);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return new PrintWriter(fw);
    }

    public Map<String, List<Calculation>> moveFileToMap() {
        Scanner sc = fileScanner(new File("calculatorusagehistory.txt"));

        Map<String, List<Calculation>> mapOfFile = new HashMap<>();
        while (sc.hasNext()) {
            List<Calculation> listOfCalculations = new ArrayList<>();
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

    public void clearFile() {
        FileWriter fw = null;
        try {
            fw = new FileWriter("calculatorusagehistory.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        PrintWriter pw = new PrintWriter(fw);
        pw.println("");
    }
}
