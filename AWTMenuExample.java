import java.awt.*;
import java.awt.event.*;

public class AWTMenuExample {
    Frame frame;
    MenuBar menuBar;
    Menu fileMenu, editMenu, aboutMenu;
    MenuItem newItem, openItem, saveItem, showAboutItem, exitItem;

    public AWTMenuExample() {
        frame = new Frame("Java AWT Examples");
        frame.setSize(400, 300);
        frame.setLayout(new FlowLayout());
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

        menuBar = new MenuBar();

        fileMenu = new Menu("File");
        newItem = new MenuItem("New", new MenuShortcut(KeyEvent.VK_N));
        openItem = new MenuItem("Open");
        saveItem = new MenuItem("Save");
        exitItem = new MenuItem("Exit");
        
        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.addSeparator();
        fileMenu.add(exitItem);

        editMenu = new Menu("Edit");

        aboutMenu = new Menu("About");
        showAboutItem = new MenuItem("Show About");
        aboutMenu.add(showAboutItem);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(aboutMenu);

        frame.setMenuBar(menuBar);

        exitItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        showAboutItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Dialog aboutDialog = new Dialog(frame, "About", true);
                aboutDialog.setSize(200, 100);
                aboutDialog.setLayout(new FlowLayout());
                Label aboutLabel = new Label("This is an AWT menu example.");
                Button okButton = new Button("OK");
                okButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        aboutDialog.setVisible(false);
                    }
                });
                aboutDialog.add(aboutLabel);
                aboutDialog.add(okButton);
                aboutDialog.setVisible(true);
            }
        });

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new AWTMenuExample();
    }
}