import java.awt.*;
import java.awt.event.*;

public class MouseEventHandler extends Frame implements MouseMotionListener, MouseListener {
    private TextField textField;

    public MouseEventHandler() {
        setTitle("Mouse Event Handler");
        setSize(400, 300);
        setLayout(new FlowLayout());

        textField = new TextField(20);
        add(textField);

        addMouseMotionListener(this);
        addMouseListener(this);

        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        // Optional: Handle mouse moved events if needed
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        textField.setText("Clicked at: (" + x + ", " + y + ")");
    }

    @Override
    public void mouseDragged(MouseEvent e) {}

    @Override
    public void mousePressed(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}

    public static void main(String[] args) {
        new MouseEventHandler();
    }
}