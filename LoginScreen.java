import java.awt.*;
import java.awt.event.*;

public class LoginScreen extends Frame {
    private TextField usernameField;
    private TextField passwordField;
    private Label messageLabel;
    private int loginAttempts = 3;

    public LoginScreen() {
        setLayout(new FlowLayout());
        
        Label usernameLabel = new Label("Username:");
        add(usernameLabel);
        usernameField = new TextField(20);
        add(usernameField);
        
        Label passwordLabel = new Label("Password:");
        add(passwordLabel);
        passwordField = new TextField(20);
        passwordField.setEchoChar('*');
        add(passwordField);
        
        Button loginButton = new Button("Login");
        add(loginButton);
        
        Button clearButton = new Button("Clear");
        add(clearButton);
        
        messageLabel = new Label("");
        add(messageLabel);
        
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    validateLogin(usernameField.getText(), passwordField.getText());
                    messageLabel.setText("Login successful!");
                } catch (Exception ex) {
                    loginAttempts--;
                    if (loginAttempts > 0) {
                        messageLabel.setText("Error: " + ex.getMessage() + " | Attempts left: " + loginAttempts);
                    } else {
                        messageLabel.setText("Login failed! No attempts left.");
                        loginButton.setEnabled(false);
                    }
                }
            }
        });
        
        clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                usernameField.setText("");
                passwordField.setText("");
                messageLabel.setText("");
            }
        });
        
        setSize(300, 200);
        setTitle("Login Screen");
        setVisible(true);
        
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    private void validateLogin(String username, String password) throws Exception {
        if (!username.equals(password)) {
            throw new Exception("Username and Password must be the same.");
        }
    }

    public static void main(String[] args) {
        new LoginScreen();
    }
}