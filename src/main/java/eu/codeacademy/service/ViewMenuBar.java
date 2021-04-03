package eu.codeacademy.service;

import javax.swing.*;
import java.awt.*;
import java.io.*;

public class ViewMenuBar extends JFrame {

    public static void getFullHistory() throws IOException {
        JFrame frame = new JFrame("History");
        frame.setSize(285, 430);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(285, 430));
        JTextArea textField = new JTextArea(15, 5);
        panel.add(textField);
        try {
            BufferedReader input = new BufferedReader(new InputStreamReader(new FileInputStream("calculatorusagehistory.txt")));
            textField.read(input, "Reading file");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        frame.getContentPane().add(textField, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }
}
