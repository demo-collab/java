import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingTemperatureConverter {
    private JFrame frame;
    private JTextField celsiusField;
    private JTextField fahrenheitField;

    public SwingTemperatureConverter() {
        frame = new JFrame("Temperature Converter");
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(2, 2));

        JLabel celsiusLabel = new JLabel("Celsius:");
        JLabel fahrenheitLabel = new JLabel("Fahrenheit:");

        celsiusField = new JTextField();
        fahrenheitField = new JTextField();

        celsiusField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                convertCelsiusToFahrenheit();
            }
        });

        fahrenheitField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                convertFahrenheitToCelsius();
            }
        });

        frame.add(celsiusLabel);
        frame.add(celsiusField);
        frame.add(fahrenheitLabel);
        frame.add(fahrenheitField);

        frame.setVisible(true);
    }

    private void convertCelsiusToFahrenheit() {
        try {
            double celsius = Double.parseDouble(celsiusField.getText());
            double fahrenheit = (celsius * 9 / 5) + 32;
            fahrenheitField.setText(String.format("%.1f", fahrenheit));
        } catch (NumberFormatException ex) {
            fahrenheitField.setText("Invalid input");
        }
    }

    private void convertFahrenheitToCelsius() {
        try {
            double fahrenheit = Double.parseDouble(fahrenheitField.getText());
            double celsius = (fahrenheit - 32) * 5 / 9;
            celsiusField.setText(String.format("%.1f", celsius));
        } catch (NumberFormatException ex) {
            celsiusField.setText("Invalid input");
        }
    }

    public static void main(String[] args) {
        new SwingTemperatureConverter();
    }
}