import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CurrencyConverter extends JFrame {
    private JTextField sgdField, usdField, eurField;

    public CurrencyConverter() {
        setTitle("Currency Converter");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 2));

        JLabel sgdLabel = new JLabel("Singapore Dollars:");
        JLabel usdLabel = new JLabel("US Dollars:");
        JLabel eurLabel = new JLabel("Euros:");

        sgdField = new JTextField();
        usdField = new JTextField();
        eurField = new JTextField();

        add(sgdLabel);
        add(sgdField);
        add(usdLabel);
        add(usdField);
        add(eurLabel);
        add(eurField);

        sgdField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                convertFromSGD();
            }
        });

        usdField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                convertFromUSD();
            }
        });

        eurField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                convertFromEUR();
            }
        });
    }

    private void convertFromSGD() {
        double sgd = Double.parseDouble(sgdField.getText());
        double usd = sgd / 1.41;
        double eur = sgd * 0.65;

        usdField.setText(String.format("%.2f", usd));
        eurField.setText(String.format("%.2f", eur));
    }

    private void convertFromUSD() {
        double usd = Double.parseDouble(usdField.getText());
        double sgd = usd * 1.41;
        double eur = usd * 0.92;

        sgdField.setText(String.format("%.2f", sgd));
        eurField.setText(String.format("%.2f", eur));
    }

    private void convertFromEUR() {
        double eur = Double.parseDouble(eurField.getText());
        double usd = eur / 0.92;
        double sgd = eur / 0.65;

        usdField.setText(String.format("%.2f", usd));
        sgdField.setText(String.format("%.2f", sgd));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new CurrencyConverter().setVisible(true);
            }
        });
    }
}