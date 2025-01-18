package Calculadora;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraGUI extends JFrame implements ActionListener {
    private JTextField display;
    private double num1, num2;
    private char operador;

    public CalculadoraGUI() {
        setTitle("Calculadora");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        display = new JTextField();
        display.setEditable(false);
        add(display, BorderLayout.NORTH);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4));

        String[] botones = {
            "7", "8", "9", "/", 
            "4", "5", "6", "*", 
            "1", "2", "3", "-", 
            "0", "C", "=", "+"
        };

        for (String texto : botones) {
            JButton button = new JButton(texto);
            button.addActionListener(this);
            panel.add(button);
        }

        add(panel, BorderLayout.CENTER);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        
        if ("0123456789".contains(command)) {
            display.setText(display.getText() + command);
        } else if (command.equals("C")) {
            display.setText("");
            num1 = num2 = 0;
        } else if (command.equals("=")) {
            try {
                num2 = Double.parseDouble(display.getText());
                double resultado = 0;
                switch (operador) {
                    case '+': resultado = num1 + num2; break;
                    case '-': resultado = num1 - num2; break;
                    case '*': resultado = num1 * num2; break;
                    case '/': resultado = num1 / num2; break;
                    default: throw new IllegalArgumentException("Operador no válido");
                }
                display.setText(String.valueOf(resultado));
            } catch (NumberFormatException ex) {
                display.setText("Error");
            }
        } else {
            num1 = Double.parseDouble(display.getText());
            operador = command.charAt(0);
            display.setText("");
        }
    }

    public static void main(String[] args) {
        new CalculadoraGUI();
    }
}
