import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DivisionCalculator extends JFrame {
    private JTextField number1Field;
    private JTextField number2Field;
    private JTextField resultField;
    private JButton divideButton;

    public DivisionCalculator() {
        setTitle("Integer Division Calculator");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2));

        JLabel number1Label = new JLabel("Number 1:");
        number1Field = new JTextField();
        JLabel number2Label = new JLabel("Number 2:");
        number2Field = new JTextField();
        JLabel resultLabel = new JLabel("Result:");
        resultField = new JTextField();
        resultField.setEditable(false);
        divideButton = new JButton("Divide");

        divideButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String num1Str = number1Field.getText();
                    String num2Str = number2Field.getText();
                    int number1 = Integer.parseInt(num1Str);
                    int number2 = Integer.parseInt(num2Str);
                    int result = number1 / number2;
                    resultField.setText(String.valueOf(result));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(DivisionCalculator.this,
                            "Please enter valid integers.", "Input Error", JOptionPane.ERROR_MESSAGE);
                } catch (ArithmeticException ex) {
                    JOptionPane.showMessageDialog(DivisionCalculator.this,
                            "Cannot divide by zero.", "Arithmetic Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        add(number1Label);
        add(number1Field);
        add(number2Label);
        add(number2Field);
        add(resultLabel);
        add(resultField);
        add(divideButton);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(DivisionCalculator::new);
    }
}