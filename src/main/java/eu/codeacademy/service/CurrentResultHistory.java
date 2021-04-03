package eu.codeacademy.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import eu.codeacademy.module.Calculation;
import jdk.nashorn.internal.ir.ObjectNode;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CurrentResultHistory {

    public static void addResultToCurrentHistory(Calculation calculation, File file) {
        ObjectMapper mapper = new ObjectMapper();
        JFrame frame = new JFrame("History");
        String oldJson = "";
        String newJson = "";
        if (file.length() > 2) {
            try {
                oldJson = mapper.readValue(file, String.class) +'-';
                newJson = oldJson.concat(calculation.getResult());
                mapper.writeValue(file, newJson);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            try {
                mapper.writeValue(file, calculation.getResult());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
            frame.setSize(285, 430);
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            JPanel panel = new JPanel();
            panel.setPreferredSize(new Dimension(285, 430));
            JTextArea textArea = new JTextArea(30, 40);
            String jsonFileAsString = "";
            try {
                jsonFileAsString = new String(Files.readAllBytes(Paths.get("C:/Users/ahrim/baigiamasis-darbas/target/currentSessionResults.json")));
            } catch (IOException e) {
                e.printStackTrace();
            }
            List<String> listOfResults = new ArrayList<>();
            String oneResult = "";
            for (int i = 0; i<jsonFileAsString.length();i++){
                if (i==jsonFileAsString.length()-1){
                    listOfResults.add(oneResult+"\n");
                } else {
                    if (jsonFileAsString.charAt(i) == '-') {
                        listOfResults.add(oneResult+"\n");
                        oneResult = "";

                    } else {
                        oneResult += jsonFileAsString.charAt(i);
                    }
                }
        }
            textArea.setText("");
            for(String s : listOfResults){
                textArea.append(s);
            }
            panel.add(textArea);
            frame.getContentPane().add(textArea, BorderLayout.CENTER);
            frame.pack();
            frame.setVisible(true);
    }
}

