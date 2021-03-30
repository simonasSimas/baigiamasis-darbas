package eu.codeacademy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FullHardcodeCalculatorWithJFrame {
    public static void main(String[] args) throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {
        UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(285, 400);
        Font font1 = new Font("SansSerif", Font.BOLD, 30);
        JButton nulis = new JButton("0");
        JButton vienas = new JButton("1");
        JButton du = new JButton("2");
        JButton trys = new JButton("3");
        JButton keturi = new JButton("4");
        JButton penki = new JButton("5");
        JButton sesi = new JButton("6");
        JButton septyni = new JButton("7");
        JButton astuoni = new JButton("8");
        JButton devyni = new JButton("9");
        JButton plus = new JButton("+");
        JButton minus = new JButton("-");
        JButton dalyba = new JButton("/");
        JButton daugyba = new JButton("*");
        JButton saknis = new JButton("\u221A");
        JButton kvadratu = new JButton("^");
        JButton lygu = new JButton("=");
        JButton isvalyti = new JButton("C");
        final JTextField skaiciuLangas = new JTextField(10 );

        skaiciuLangas.setFont(font1);
        nulis.setFont(font1);
        vienas.setFont(font1);
        du.setFont(font1);
        trys.setFont(font1);
        keturi.setFont(font1);
        penki.setFont(font1);
        sesi.setFont(font1);
        septyni.setFont(font1);
        astuoni.setFont(font1);
        devyni.setFont(font1);
        plus.setFont(font1);
        minus.setFont(font1);
        dalyba.setFont(font1);
        daugyba.setFont(font1);
        saknis.setFont(font1);
        kvadratu.setFont(font1);
        lygu.setFont(font1);
        isvalyti.setFont(font1);

        final int[] pasirinkimas = {0};
        final String[] esamasSkaicius = {"0"};
        skaiciuLangas.setText("0.0");
        nulis.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!(Double.parseDouble(skaiciuLangas.getText()) == 0))
                    skaiciuLangas.setText(skaiciuLangas.getText() + 0);
            }
        });
        vienas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!(Double.parseDouble(skaiciuLangas.getText()) == 0)) {
                    skaiciuLangas.setText(skaiciuLangas.getText() + 1);

                } else {
                    skaiciuLangas.setText("1");
                }
            }
        });
        du.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!(Double.parseDouble(skaiciuLangas.getText()) == 0)) {
                    skaiciuLangas.setText(skaiciuLangas.getText() + 2);

                } else {
                    skaiciuLangas.setText("2");
                }
            }
        });
        trys.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!(Double.parseDouble(skaiciuLangas.getText()) == 0)) {
                    skaiciuLangas.setText(skaiciuLangas.getText() + 3);

                } else {
                    skaiciuLangas.setText("3");
                }
            }
        });
        keturi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!(Double.parseDouble(skaiciuLangas.getText()) == 0)) {
                    skaiciuLangas.setText(skaiciuLangas.getText() + 4);

                } else {
                    skaiciuLangas.setText("4");
                }
            }
        });
        penki.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!(Double.parseDouble(skaiciuLangas.getText()) == 0)) {
                    skaiciuLangas.setText(skaiciuLangas.getText() + 5);

                } else {
                    skaiciuLangas.setText("5");
                }
            }
        });
        sesi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!(Double.parseDouble(skaiciuLangas.getText()) == 0)) {
                    skaiciuLangas.setText(skaiciuLangas.getText() + 6);

                } else {
                    skaiciuLangas.setText("6");
                }
            }
        });
        septyni.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!(Double.parseDouble(skaiciuLangas.getText()) == 0)) {
                    skaiciuLangas.setText(skaiciuLangas.getText() + 7);

                } else {
                    skaiciuLangas.setText("7");
                }
            }
        });
        astuoni.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!(Double.parseDouble(skaiciuLangas.getText()) == 0)) {
                    skaiciuLangas.setText(skaiciuLangas.getText() + 8);

                } else {
                    skaiciuLangas.setText("8");
                }
            }
        });
        devyni.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!(Double.parseDouble(skaiciuLangas.getText()) == 0)) {
                    skaiciuLangas.setText(skaiciuLangas.getText() + 9);

                } else {
                    skaiciuLangas.setText("9");
                }
            }
        });
        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (skaiciuLangas.getText().length()>15){
                    esamasSkaicius[0] = ("" + (Double.parseDouble(skaiciuLangas.getText()))).substring(0,15);
                }else{
                    esamasSkaicius[0] = ("" + (Double.parseDouble(skaiciuLangas.getText()))).substring(0,skaiciuLangas.getText().length());
                }
                skaiciuLangas.setText("0");
                pasirinkimas[0] = 1;
            }
        });
        minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (skaiciuLangas.getText().length()>15){
                    esamasSkaicius[0] = ("" + (Double.parseDouble(skaiciuLangas.getText()))).substring(0,15);
                }else{
                    esamasSkaicius[0] = ("" + (Double.parseDouble(skaiciuLangas.getText()))).substring(0,skaiciuLangas.getText().length());
                }
                skaiciuLangas.setText("0");
                pasirinkimas[0] = 2;
            }
        });
        dalyba.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (skaiciuLangas.getText().length()>15){
                    esamasSkaicius[0] = ("" + (Double.parseDouble(skaiciuLangas.getText()))).substring(0,15);
                }else{
                    esamasSkaicius[0] = ("" + (Double.parseDouble(skaiciuLangas.getText()))).substring(0,skaiciuLangas.getText().length());
                }
                skaiciuLangas.setText("0");
                pasirinkimas[0] = 3;
            }
        });
        daugyba.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (skaiciuLangas.getText().length()>15){
                    esamasSkaicius[0] = ("" + (Double.parseDouble(skaiciuLangas.getText()))).substring(0,15);
                }else{
                    esamasSkaicius[0] = ("" + (Double.parseDouble(skaiciuLangas.getText()))).substring(0,skaiciuLangas.getText().length());
                }

                skaiciuLangas.setText("0");
                pasirinkimas[0] = 4;
            }
        });
        saknis.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                esamasSkaicius[0] = "" + (Math.sqrt(Double.parseDouble(skaiciuLangas.getText())));
                if (esamasSkaicius[0].length()>15) {
                    skaiciuLangas.setText(esamasSkaicius[0].substring(0, 15));
                }
            }
        });
        kvadratu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                esamasSkaicius[0] = "" + (Double.parseDouble(skaiciuLangas.getText()) * Double.parseDouble(skaiciuLangas.getText()));
                if (esamasSkaicius[0].length()>15) {
                    skaiciuLangas.setText(esamasSkaicius[0].substring(0, 15));
                }
            }
        });
        lygu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(pasirinkimas[0]==1) {
                    skaiciuLangas.setText(""+(Double.parseDouble(esamasSkaicius[0]) + Double.parseDouble(skaiciuLangas.getText())));
                } else if(pasirinkimas[0]==2){
                    skaiciuLangas.setText(""+(Double.parseDouble(esamasSkaicius[0]) - Double.parseDouble(skaiciuLangas.getText())));
                } else if (pasirinkimas[0]==3){
                    skaiciuLangas.setText(""+(Double.parseDouble(esamasSkaicius[0]) / Double.parseDouble(skaiciuLangas.getText())));
                } else if (pasirinkimas[0]==4) {
                    skaiciuLangas.setText("" + (Double.parseDouble(esamasSkaicius[0]) * Double.parseDouble(skaiciuLangas.getText())));
                } else if (pasirinkimas[0]==0) {
                    skaiciuLangas.setText(esamasSkaicius[0]);
                }
            }
        });
        isvalyti.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                skaiciuLangas.setText("0.0");
                esamasSkaicius[0] = "";
            }
        });

        JPanel topPanel = new JPanel();
        JPanel rightPanel = new JPanel(new GridLayout(0, 1));
        JPanel leftPanel = new JPanel(new GridLayout(0, 1));
        JPanel centerPanel = new JPanel(new GridLayout(0, 1));

        topPanel.setPreferredSize(new Dimension(280, 50));
        rightPanel.setPreferredSize(new Dimension(90, 30));
        leftPanel.setPreferredSize(new Dimension(90, 30));
        centerPanel.setPreferredSize(new Dimension(90, 30));
        topPanel.add(skaiciuLangas);
        leftPanel.add(plus);
        leftPanel.add(minus);
        leftPanel.add(septyni);
        leftPanel.add(keturi);
        leftPanel.add(vienas);
        leftPanel.add(isvalyti);
        centerPanel.add(daugyba);
        centerPanel.add(dalyba);
        centerPanel.add(astuoni);
        centerPanel.add(penki);
        centerPanel.add(du);
        centerPanel.add(nulis);
        rightPanel.add(saknis);
        rightPanel.add(kvadratu);
        rightPanel.add(devyni);
        rightPanel.add(sesi);
        rightPanel.add(trys);
        rightPanel.add(lygu);

        topPanel.setBackground(Color.GRAY);
        frame.getContentPane().add(BorderLayout.NORTH, topPanel);
        frame.getContentPane().add(BorderLayout.WEST, leftPanel);
        frame.getContentPane().add(BorderLayout.EAST, rightPanel);
        frame.getContentPane().add(BorderLayout.CENTER, centerPanel);

        frame.setVisible(true);
    }
}
