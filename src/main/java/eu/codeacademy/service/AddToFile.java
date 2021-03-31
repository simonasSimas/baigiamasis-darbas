package eu.codeacademy.service;

import eu.codeacademy.module.Calculations;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public abstract class AddToFile {
    public  void addMapToFile(Map<String, List<Calculations>> map) {
        PrintWriter pw = write();
        File file = new File("calculatorusagehistory.txt");
        List<String> listOfDates = new ArrayList<>(map.keySet());
        int functionNumber = 1;
        for (String s : listOfDates){
            pw.println("Date: " + s);
            pw.println("List of calculations: ");
            for (Calculations calculations : map.get(s)){
                pw.println(functionNumber+".");
                pw.println("Function: " + calculations.getFunction());
                pw.println("Result: " + calculations.getResult());
                pw.println("Calculation made at: " + calculations.getTime());
                functionNumber++;
            }
            pw.println("<-------------->");
            pw.close();
        }
    }

    public PrintWriter write() {
        FileWriter fw = null;
        try {
            fw = new FileWriter("calculatorusagehistory.txt",true);
        } catch (IOException e) {
            e.printStackTrace();
        }
        PrintWriter pw = new PrintWriter(fw);
        return pw;
    }

    public Map<String, List<Calculations>> moveFileToMap(File file){
        Scanner sc = fileScanner(file);
        List<Calculations> listOfCalculations = new ArrayList<>();
        String date = "";
        while(sc.hasNextLine()){
            String dateFromFile = sc.nextLine();
            String function = sc.nextLine();
        }
        return null;
    }

    private Scanner fileScanner(File file){
        Scanner sc = null;
        try {
            sc = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return sc;
    }
}
