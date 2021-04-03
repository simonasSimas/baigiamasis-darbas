package eu.codeacademy;

import eu.codeacademy.module.Calculation;
import eu.codeacademy.service.CurrentResultHistory;
import eu.codeacademy.service.ViewMenuBar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class FullHardcodeCalculatorWithJFrame {
    public static void main(String[] args) throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {
        File file = new File("target/currentSessionResults.json");
        Calculation calculation = new Calculation("","");
        UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(285, 430);
        Font font1 = new Font("SansSerif", Font.BOLD, 30);
        JButton zero = new JButton("0");
        JButton one = new JButton("1");
        JButton two = new JButton("2");
        JButton three = new JButton("3");
        JButton four = new JButton("4");
        JButton five = new JButton("5");
        JButton six = new JButton("6");
        JButton seven = new JButton("7");
        JButton eight = new JButton("8");
        JButton nine = new JButton("9");
        JButton plus = new JButton("+");
        JButton minus = new JButton("-");
        JButton division = new JButton("/");
        JButton multiplication = new JButton("*");
        JButton squareRoot = new JButton("\u221A");
        JButton square = new JButton("^");
        JButton equals = new JButton("=");
        JButton clear = new JButton("C");
        JButton save = new JButton("S");
        JButton history = new JButton("H");
        JButton point = new JButton(".");
        final JTextField numberField = new JTextField(10 );

        //menu button view
        JMenuBar menuBar = new JMenuBar();
        JMenu view = new JMenu("view");
        view.setMnemonic(KeyEvent.VK_F);
        JMenuItem fullHistory = new JMenuItem("Full history");
        fullHistory.setMnemonic(KeyEvent.VK_E);
        fullHistory.setToolTipText("See the full history of calculations saved to this calculator");
        view.add(fullHistory);
        menuBar.add(view);
        frame.setJMenuBar(menuBar);
        fullHistory.addActionListener((event) -> {
            try {
                ViewMenuBar.getFullHistory();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        //

        numberField.setFont(font1);
        zero.setFont(font1);
        one.setFont(font1);
        two.setFont(font1);
        three.setFont(font1);
        four.setFont(font1);
        five.setFont(font1);
        six.setFont(font1);
        seven.setFont(font1);
        eight.setFont(font1);
        nine.setFont(font1);
        plus.setFont(font1);
        minus.setFont(font1);
        division.setFont(font1);
        multiplication.setFont(font1);
        squareRoot.setFont(font1);
        square.setFont(font1);
        equals.setFont(font1);
        clear.setFont(font1);
        save.setFont(font1);
        point.setFont(font1);
        history.setFont(font1);

        final int[] pasirinkimas = {0};
        final String[] esamasSkaicius = {"0"};
        numberField.setText("0");
        zero.addActionListener(e -> {
            if ((Double.parseDouble(numberField.getText()) != 0)) {
                numberField.setText(numberField.getText() + 0);
                calculation.setFunction(calculation.getFunction().concat("0"));
            }else{
                calculation.setFunction("0");
            }
        });
        one.addActionListener(e -> {
            if ((Double.parseDouble(numberField.getText()) != 0) || (numberField.getText().contains("."))) {
                numberField.setText(numberField.getText() + 1);
                String currentFunction = calculation.getFunction();
                calculation.setFunction(currentFunction.concat("1"));

            } else {
                numberField.setText("1");
                calculation.setFunction("1");
            }
        });
        two.addActionListener(e -> {
            if ((Double.parseDouble(numberField.getText()) != 0)) {
                numberField.setText(numberField.getText() + 2);
                calculation.setFunction(calculation.getFunction().concat("2"));
            } else {
                numberField.setText("2");
                calculation.setFunction("2");
            }
        });
        three.addActionListener(e -> {
            if ((Double.parseDouble(numberField.getText()) != 0)) {
                numberField.setText(numberField.getText() + 3);
                calculation.setFunction(calculation.getFunction().concat("3"));

            } else {
                numberField.setText("3");
                calculation.setFunction("0");
            }
        });
        four.addActionListener(e -> {
            if ((Double.parseDouble(numberField.getText()) != 0)) {
                numberField.setText(numberField.getText() + 4);
                calculation.setFunction(calculation.getFunction().concat("4"));
            } else {
                numberField.setText("4");
                calculation.setFunction("4");
            }
        });
        five.addActionListener(e -> {
            if ((Double.parseDouble(numberField.getText()) != 0)) {
                numberField.setText(numberField.getText() + 5);
                calculation.setFunction(calculation.getFunction().concat("5"));
            } else {
                numberField.setText("5");
                calculation.setFunction("5");
            }
        });
        six.addActionListener(e -> {
            if ((Double.parseDouble(numberField.getText()) != 0)) {
                numberField.setText(numberField.getText() + 6);
                calculation.setFunction(calculation.getFunction().concat("6"));
            } else {
                numberField.setText("6");
                calculation.setFunction("6");
            }
        });
        seven.addActionListener(e -> {
            if ((Double.parseDouble(numberField.getText()) != 0)) {
                numberField.setText(numberField.getText() + 7);
                calculation.setFunction(calculation.getFunction().concat("7"));
            } else {
                numberField.setText("7");
                calculation.setFunction("7");
            }
        });
        eight.addActionListener(e -> {
            if ((Double.parseDouble(numberField.getText()) != 0)) {
                numberField.setText(numberField.getText() + 8);
                calculation.setFunction(calculation.getFunction().concat("8"));
            } else {
                numberField.setText("8");
                calculation.setFunction("8");
            }
        });
        nine.addActionListener(e -> {
            if ((Double.parseDouble(numberField.getText()) != 0)) {
                numberField.setText(numberField.getText() + 9);
                calculation.setFunction(calculation.getFunction().concat("9"));
            } else {
                numberField.setText("9");
                calculation.setFunction("9");
            }
        });
        plus.addActionListener(e -> {
            calculation.setFunction(calculation.getFunction().concat(" + "));
            if (numberField.getText().length()>15){
                esamasSkaicius[0] = ("" + (Double.parseDouble(numberField.getText()))).substring(0,15);
            }else{
                esamasSkaicius[0] = ("" + (Double.parseDouble(numberField.getText()))).substring(0,numberField.getText().length());
            }
            numberField.setText("0");
            pasirinkimas[0] = 1;
        });
        minus.addActionListener(e -> {
            calculation.setFunction(calculation.getFunction().concat(" - "));
            if (numberField.getText().length()>15){
                esamasSkaicius[0] = ("" + (Double.parseDouble(numberField.getText()))).substring(0,15);
            }else{
                esamasSkaicius[0] = ("" + (Double.parseDouble(numberField.getText()))).substring(0,numberField.getText().length());
            }
            numberField.setText("0");
            pasirinkimas[0] = 2;
        });
        division.addActionListener(e -> {
            calculation.setFunction(calculation.getFunction().concat(" / "));
            if (numberField.getText().length()>15){
                esamasSkaicius[0] = ("" + (Double.parseDouble(numberField.getText()))).substring(0,15);
            }else{
                esamasSkaicius[0] = ("" + (Double.parseDouble(numberField.getText()))).substring(0,numberField.getText().length());
            }
            numberField.setText("0");
            pasirinkimas[0] = 3;
        });
        multiplication.addActionListener(e -> {
            calculation.setFunction(calculation.getFunction().concat(" * "));
            if (numberField.getText().length()>15){
                esamasSkaicius[0] = ("" + (Double.parseDouble(numberField.getText()))).substring(0,15);
            }else{
                esamasSkaicius[0] = ("" + (Double.parseDouble(numberField.getText()))).substring(0,numberField.getText().length());
            }

            numberField.setText("0");
            pasirinkimas[0] = 4;
        });
        squareRoot.addActionListener(e -> {
            calculation.setFunction(calculation.getFunction().concat(" \u221A "));
            esamasSkaicius[0] = "" + (Math.sqrt(Double.parseDouble(numberField.getText())));
            if (esamasSkaicius[0].length()>15) {
                numberField.setText(esamasSkaicius[0].substring(0, 15));
            }
        });
        square.addActionListener(e -> {
            calculation.setFunction(calculation.getFunction().concat(" ^2 "));
            esamasSkaicius[0] = "" + (Double.parseDouble(numberField.getText()) * Double.parseDouble(numberField.getText()));
            if (esamasSkaicius[0].length()>15) {
                numberField.setText(esamasSkaicius[0].substring(0, 15));
            }
        });
        equals.addActionListener(e -> {
            calculation.setFunction(calculation.getFunction().concat(" = "));
            if(pasirinkimas[0]==1) {
                numberField.setText(""+(Double.parseDouble(esamasSkaicius[0]) + Double.parseDouble(numberField.getText())));
            } else if(pasirinkimas[0]==2){
                numberField.setText(""+(Double.parseDouble(esamasSkaicius[0]) - Double.parseDouble(numberField.getText())));
            } else if (pasirinkimas[0]==3){
                numberField.setText(""+(Double.parseDouble(esamasSkaicius[0]) / Double.parseDouble(numberField.getText())));
            } else if (pasirinkimas[0]==4) {
                numberField.setText("" + (Double.parseDouble(esamasSkaicius[0]) * Double.parseDouble(numberField.getText())));
            } else if (pasirinkimas[0]==0) {
                numberField.setText(esamasSkaicius[0]);
            }
            calculation.setFunction(calculation.getFunction().concat(numberField.getText()));
            calculation.setResult(numberField.getText());
            calculation.setTime(LocalTime.now() + "");

        });
        clear.addActionListener(e -> {
            numberField.setText("0");
            esamasSkaicius[0] = "";
        });
        history.addActionListener(e-> CurrentResultHistory.addResultToCurrentHistory(calculation,file));
        point.addActionListener(e -> numberField.setText(numberField.getText().concat(".")));


        JPanel topPanel = new JPanel();
        JPanel rightPanel = new JPanel(new GridLayout(0, 1));
        JPanel leftPanel = new JPanel(new GridLayout(0, 1));
        JPanel centerPanel = new JPanel(new GridLayout(0, 1));

        topPanel.setPreferredSize(new Dimension(280, 50));
        rightPanel.setPreferredSize(new Dimension(90, 30));
        leftPanel.setPreferredSize(new Dimension(90, 30));
        centerPanel.setPreferredSize(new Dimension(90, 30));
        topPanel.add(numberField);
        leftPanel.add(history);
        leftPanel.add(plus);
        leftPanel.add(minus);
        leftPanel.add(seven);
        leftPanel.add(four);
        leftPanel.add(one);
        leftPanel.add(point);
        centerPanel.add(save);
        centerPanel.add(multiplication);
        centerPanel.add(division);
        centerPanel.add(eight);
        centerPanel.add(five);
        centerPanel.add(two);
        centerPanel.add(zero);
        rightPanel.add(clear);
        rightPanel.add(squareRoot);
        rightPanel.add(square);
        rightPanel.add(nine);
        rightPanel.add(six);
        rightPanel.add(three);
        rightPanel.add(equals);

        topPanel.setBackground(Color.GRAY);
        frame.getContentPane().add(BorderLayout.NORTH, topPanel);
        frame.getContentPane().add(BorderLayout.WEST, leftPanel);
        frame.getContentPane().add(BorderLayout.EAST, rightPanel);
        frame.getContentPane().add(BorderLayout.CENTER, centerPanel);

        frame.setVisible(true);
    }
}
