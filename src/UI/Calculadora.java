package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class Calculadora implements ActionListener {
    private JFrame frame;
    private JTextField textField;
    private JButton[] buttons;
    private String[] buttonLabels = {
            "7", "8", "9", "+",
            "4", "5", "6", "-",
            "1", "2", "3", "*",
            "0", ".", "C", "/","="
    };
    private double num1 = 0, num2 = 0;
    private String operator = "";

    public Calculadora() {
        frame = new JFrame("Calculadora");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        textField = new JTextField();
        textField.setEditable(false);
        textField.setHorizontalAlignment(JTextField.RIGHT);
        frame.add(textField, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(5, 4, 5, 5));
        buttons = new JButton[buttonLabels.length];
        for (int i = 0; i < buttonLabels.length; i++) {
            buttons[i] = new JButton(buttonLabels[i]);
            buttons[i].addActionListener(this);
            buttonPanel.add(buttons[i]);
        }
        frame.add(buttonPanel, BorderLayout.CENTER);

        frame.pack();
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String buttonText = e.getActionCommand();
        switch (buttonText) {
            case "C":
                num1 = 0;
                num2 = 0;
                operator = "";
                textField.setText("");
                break;
            case "+":
            case "-":
            case "*":
            case "/":
                operator = buttonText;
                num1 = Double.parseDouble(textField.getText());
                textField.setText("");
                break;
            case "=":
                num2 = Double.parseDouble(textField.getText());
                double result = 0;
                switch (operator) {
                    case "+":
                        result = num1 + num2;
                        break;
                    case "-":
                        result = num1 - num2;
                        break;
                    case "*":
                        result = num1 * num2;
                        break;
                    case "/":
                        result = num1 / num2;
                        break;
                }
                textField.setText(String.valueOf(result));
                break;
            default:
                textField.setText(textField.getText() + buttonText);
                break;
        }
    }

    public static void main(String[] args) {
        new Calculadora();
    }
}
