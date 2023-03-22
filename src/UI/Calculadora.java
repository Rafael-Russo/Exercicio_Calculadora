package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora extends JFrame implements ActionListener {

    private JButton btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_9, btn_0, btn_igual, btn_mult, btn_div, btn_mais, btn_menos;

    public void janela(){
        JFrame frame = new JFrame();
        btn_0 = new JButton();
        btn_0.setText("0");
        btn_0.setBounds(75, 150, 75, 50);
        btn_1 = new JButton();
        btn_1.setText("1");
        btn_1.setBounds(0, 0, 75, 50);
        btn_2 = new JButton();
        btn_2.setText("2");
        btn_2.setBounds(75, 0, 75, 50);
        btn_3 = new JButton();
        btn_3.setText("3");
        btn_3.setBounds(150, 0, 75, 50);
        btn_4 = new JButton();
        btn_4.setText("4");
        btn_4.setBounds(0, 50, 75, 50);
        btn_5 = new JButton();
        btn_5.setText("5");
        btn_5.setBounds(75, 50, 75, 50);
        btn_6 = new JButton();
        btn_6.setText("6");
        btn_6.setBounds(150, 50, 75, 50);
        btn_7 = new JButton();
        btn_7.setText("7");
        btn_7.setBounds(0, 100, 75, 50);
        btn_8 = new JButton();
        btn_8.setText("8");
        btn_8.setBounds(75, 100, 75, 50);
        btn_9 = new JButton();
        btn_9.setText("9");
        btn_9.setBounds(150, 100, 75, 50);
        btn_igual = new JButton();
        btn_igual.setText("=");
        btn_igual.setBounds(225, 0, 75, 50);
        btn_mult = new JButton();
        btn_mult.setText("*");
        btn_mult.setBounds(225, 50, 75, 50);
        btn_div = new JButton();
        btn_div.setText("/");
        btn_div.setBounds(225, 100, 75, 50);
        btn_mais = new JButton();
        btn_mais.setText("+");
        btn_mais.setBounds(225, 0, 75, 50);
        btn_menos = new JButton();
        btn_menos.setText("-");
        btn_menos.setBounds(225, 150, 75, 50);


//        REGISTRA EVENTO
        btn_0.addActionListener(this);
        btn_1.addActionListener(this);
        btn_2.addActionListener(this);
        btn_3.addActionListener(this);
        btn_4.addActionListener(this);
        btn_5.addActionListener(this);
        btn_6.addActionListener(this);
        btn_7.addActionListener(this);
        btn_8.addActionListener(this);
        btn_9.addActionListener(this);
        btn_igual.addActionListener(this);
        btn_mult.addActionListener(this);
        btn_div.addActionListener(this);
        btn_mais.addActionListener(this);
        btn_menos.addActionListener(this);


        frame.getContentPane().add(btn_0);
        frame.getContentPane().add(btn_1);
        frame.getContentPane().add(btn_2);
        frame.getContentPane().add(btn_3);
        frame.getContentPane().add(btn_4);
        frame.getContentPane().add(btn_5);
        frame.getContentPane().add(btn_6);
        frame.getContentPane().add(btn_7);
        frame.getContentPane().add(btn_8);
        frame.getContentPane().add(btn_9);
        frame.getContentPane().add(btn_igual);
        frame.getContentPane().add(btn_mult);
        frame.getContentPane().add(btn_div);
        frame.getContentPane().add(btn_mais);
        frame.getContentPane().add(btn_menos);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent evento){

    }

    public static void main(String[] args) {
        Calculadora captura = new Calculadora();
        captura.janela();
    }
}
