package eu.codeacademy.app_interface.run_app;

import com.fasterxml.jackson.databind.ObjectMapper;
import eu.codeacademy.app_interface.ViewMenuBar;
import eu.codeacademy.file_handling.CurrentResultHistory;
import eu.codeacademy.module.Calculation;
import eu.codeacademy.module.enums.Numbers;
import eu.codeacademy.module.exceptions.DivisionByZero;
import eu.codeacademy.module.exceptions.SquareRootFromNegativeNumber;
import eu.codeacademy.service.CalculatorUsageDateTrackerImpl;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public interface CalculatorAppRuntime {
    static void run() {

        //needed objects
        CalculatorUsageDateTrackerImpl calculatorTracker = new CalculatorUsageDateTrackerImpl();
        File file = new File("target/currentSessionResults.json");
        Calculation calculation = new Calculation("", "");
        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.writeValue(file, "Calculations: ");
        } catch (IOException e) {
            e.printStackTrace();
        }
        //

        //Jframe setup
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (ClassNotFoundException | UnsupportedLookAndFeelException | IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(285, 430);
        //

        //app interface adn buttons
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
        final JTextField numberField = new JTextField(10);
        //

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
        fullHistory.addActionListener(event -> {
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

        final int[] chosenOption = {0};
        final String[] curretnNumber = {"0"};
        numberField.setText(Numbers.ZERO.getValue());
        zero.addActionListener(e -> {
            if ((Double.parseDouble(numberField.getText()) != 0)) {
                numberField.setText(numberField.getText() + 0);
                String currentFunction = calculation.getFunction();
                calculation.setFunction(currentFunction.concat(Numbers.ZERO.getValue()));
            } else {
                String currentFunction = calculation.getFunction();
                calculation.setFunction(currentFunction.concat(Numbers.ZERO.getValue()));
            }
        });
        one.addActionListener(e -> {
            if ((Double.parseDouble(numberField.getText()) != 0) || (numberField.getText().contains("."))) {
                numberField.setText(numberField.getText() + 1);
                String currentFunction = calculation.getFunction();
                calculation.setFunction(currentFunction.concat(Numbers.ONE.getValue()));

            } else {
                numberField.setText(Numbers.ONE.getValue());
                String currentFunction = calculation.getFunction();
                calculation.setFunction(currentFunction.concat(Numbers.ONE.getValue()));
            }
        });
        two.addActionListener(e -> {
            if ((Double.parseDouble(numberField.getText()) != 0) || (numberField.getText().contains("."))) {
                numberField.setText(numberField.getText() + 2);
                String currentFunction = calculation.getFunction();
                calculation.setFunction(currentFunction.concat(Numbers.TWO.getValue()));
            } else {
                numberField.setText(Numbers.TWO.getValue());
                String currentFunction = calculation.getFunction();
                calculation.setFunction(currentFunction.concat(Numbers.TWO.getValue()));
            }
        });
        three.addActionListener(e -> {
            if ((Double.parseDouble(numberField.getText()) != 0) || (numberField.getText().contains("."))) {
                numberField.setText(numberField.getText() + 3);
                String currentFunction = calculation.getFunction();
                calculation.setFunction(currentFunction.concat(Numbers.THREE.getValue()));

            } else {
                numberField.setText("3");
                String currentFunction = calculation.getFunction();
                calculation.setFunction(currentFunction.concat(Numbers.THREE.getValue()));
            }
        });
        four.addActionListener(e -> {
            if ((Double.parseDouble(numberField.getText()) != 0) || (numberField.getText().contains("."))) {
                numberField.setText(numberField.getText() + 4);
                String currentFunction = calculation.getFunction();
                calculation.setFunction(currentFunction.concat(Numbers.FOUR.getValue()));
            } else {
                numberField.setText(Numbers.FOUR.getValue());
                String currentFunction = calculation.getFunction();
                calculation.setFunction(currentFunction.concat(Numbers.FOUR.getValue()));
            }
        });
        five.addActionListener(e -> {
            if ((Double.parseDouble(numberField.getText()) != 0) || (numberField.getText().contains("."))) {
                numberField.setText(numberField.getText() + 5);
                String currentFunction = calculation.getFunction();
                calculation.setFunction(currentFunction.concat(Numbers.FIVE.getValue()));
            } else {
                numberField.setText(Numbers.FIVE.getValue());
                String currentFunction = calculation.getFunction();
                calculation.setFunction(currentFunction.concat(Numbers.FIVE.getValue()));
            }
        });
        six.addActionListener(e -> {
            if ((Double.parseDouble(numberField.getText()) != 0) || (numberField.getText().contains("."))) {
                numberField.setText(numberField.getText() + 6);
                String currentFunction = calculation.getFunction();
                calculation.setFunction(currentFunction.concat(Numbers.SIX.getValue()));
            } else {
                numberField.setText(Numbers.SIX.getValue());
                String currentFunction = calculation.getFunction();
                calculation.setFunction(currentFunction.concat(Numbers.SIX.getValue()));
            }
        });
        seven.addActionListener(e -> {
            if ((Double.parseDouble(numberField.getText()) != 0) || (numberField.getText().contains("."))) {
                numberField.setText(numberField.getText() + 7);
                String currentFunction = calculation.getFunction();
                calculation.setFunction(currentFunction.concat(Numbers.SEVEN.getValue()));
            } else {
                numberField.setText(Numbers.SEVEN.getValue());
                String currentFunction = calculation.getFunction();
                calculation.setFunction(currentFunction.concat(Numbers.SEVEN.getValue()));
            }
        });
        eight.addActionListener(e -> {
            if ((Double.parseDouble(numberField.getText()) != 0) || (numberField.getText().contains("."))) {
                numberField.setText(numberField.getText() + 8);
                String currentFunction = calculation.getFunction();
                calculation.setFunction(currentFunction.concat(Numbers.EIGHT.getValue()));
            } else {
                numberField.setText(Numbers.EIGHT.getValue());
                String currentFunction = calculation.getFunction();
                calculation.setFunction(currentFunction.concat(Numbers.EIGHT.getValue()));
            }
        });
        nine.addActionListener(e -> {
            if ((Double.parseDouble(numberField.getText()) != 0) || (numberField.getText().contains("."))) {
                numberField.setText(numberField.getText() + 9);
                String currentFunction = calculation.getFunction();
                calculation.setFunction(currentFunction.concat(Numbers.NINE.getValue()));
            } else {
                numberField.setText(Numbers.NINE.getValue());
                String currentFunction = calculation.getFunction();
                calculation.setFunction(currentFunction.concat(Numbers.NINE.getValue()));
            }
        });
        plus.addActionListener(e -> {
            String currentFunction = calculation.getFunction();
            calculation.setFunction(currentFunction.concat(" + "));
            if (numberField.getText().length() > 15) {
                curretnNumber[0] = ("" + (Double.parseDouble(numberField.getText()))).substring(0, 15);
            } else {
                curretnNumber[0] = ("" + (Double.parseDouble(numberField.getText()))).substring(0, numberField.getText().length());
            }
            numberField.setText("0");
            chosenOption[0] = 1;
        });
        minus.addActionListener(e -> {
            calculation.setFunction(calculation.getFunction().concat(" - "));
            if (numberField.getText().length() > 15) {
                curretnNumber[0] = ("" + (Double.parseDouble(numberField.getText()))).substring(0, 15);
            } else {
                curretnNumber[0] = ("" + (Double.parseDouble(numberField.getText()))).substring(0, numberField.getText().length());
            }
            numberField.setText("0");
            chosenOption[0] = 2;
        });
        division.addActionListener(e -> {
            calculation.setFunction(calculation.getFunction().concat(" / "));
            if (numberField.getText().length() > 15) {
                curretnNumber[0] = ("" + (Double.parseDouble(numberField.getText()))).substring(0, 15);
            } else {
                curretnNumber[0] = ("" + (Double.parseDouble(numberField.getText()))).substring(0, numberField.getText().length());
            }
            numberField.setText("0");
            chosenOption[0] = 3;
        });
        multiplication.addActionListener(e -> {
            calculation.setFunction(calculation.getFunction().concat(" * "));
            if (numberField.getText().length() > 15) {
                curretnNumber[0] = ("" + (Double.parseDouble(numberField.getText()))).substring(0, 15);
            } else {
                curretnNumber[0] = ("" + (Double.parseDouble(numberField.getText()))).substring(0, numberField.getText().length());
            }

            numberField.setText("0");
            chosenOption[0] = 4;
        });
        squareRoot.addActionListener(e -> {
            calculation.setFunction(calculation.getFunction().concat(" \u221A "));
            try {
                curretnNumber[0] = "" + (Math.sqrt(Double.parseDouble(numberField.getText())));
            }catch (SquareRootFromNegativeNumber ex) {
                numberField.setText("ERROR: - ROOT");
            }
            if (curretnNumber[0].length() > 15) {
                numberField.setText(curretnNumber[0].substring(0, 15));
            }
        });
        square.addActionListener(e -> {
            calculation.setFunction(calculation.getFunction().concat(" ^2 "));
            curretnNumber[0] = "" + (Double.parseDouble(numberField.getText()) * Double.parseDouble(numberField.getText()));
            if (curretnNumber[0].length() > 15) {
                numberField.setText(curretnNumber[0].substring(0, 15));
            }
        });
        equals.addActionListener(e -> {
            calculation.setFunction(calculation.getFunction().concat(" = "));
            if (chosenOption[0] == 1) {
                numberField.setText("" + (Double.parseDouble(curretnNumber[0]) + Double.parseDouble(numberField.getText())));
            } else if (chosenOption[0] == 2) {
                numberField.setText("" + (Double.parseDouble(curretnNumber[0]) - Double.parseDouble(numberField.getText())));
            } else if (chosenOption[0] == 3) {
                try {
                    numberField.setText("" + (Double.parseDouble(curretnNumber[0]) / Double.parseDouble(numberField.getText())));
                } catch (DivisionByZero ex){
                    numberField.setText("ERROR: DIV BY 0");
                }
            } else if (chosenOption[0] == 4) {
                numberField.setText("" + (Double.parseDouble(curretnNumber[0]) * Double.parseDouble(numberField.getText())));
            } else if (chosenOption[0] == 0) {
                numberField.setText(curretnNumber[0]);
            }
            calculation.setFunction(calculation.getFunction().concat(numberField.getText()));
            calculation.setResult(numberField.getText());
            calculation.setTime(LocalTime.now() + "");
            CurrentResultHistory.addResultToCurrentHistory(calculation, file);
        });
        clear.addActionListener(e -> {
            numberField.setText("0");
            curretnNumber[0] = "";
            calculation.resetCalculation();
        });
        history.addActionListener(e -> CurrentResultHistory.seeCurrentResults());
        point.addActionListener(e -> numberField.setText(numberField.getText().concat(".")));
        save.addActionListener(actionEvent -> {
                    Map<String, List<Calculation>> map = calculatorTracker.moveFileToMap();
                    List<Calculation> listOfCalculationsAlreadyMade = new ArrayList<>();
                    String date = LocalDate.now() + "";
                    listOfCalculationsAlreadyMade.add(calculation);
                    if (map.containsKey(date)) {
                        listOfCalculationsAlreadyMade = map.get(date);
                        listOfCalculationsAlreadyMade.add(calculation);
                        map.replace(date, map.get(date), listOfCalculationsAlreadyMade);
                    } else {
                        listOfCalculationsAlreadyMade.add(calculation);
                        map.put(LocalDate.now() + "", listOfCalculationsAlreadyMade);
                    }
                    calculatorTracker.clearFile();
                    calculatorTracker.addMapToFile(map);
                }
        );

        //jframe ending
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
        //
    }
}
