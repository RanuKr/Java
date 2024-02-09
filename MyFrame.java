import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    private JButton button;

    public MyFrame() {
        // Initialize the JFrame
        super("My Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create the button
        button = new JButton("Click me");

        // Add action listener to the button
        button.addActionListener(this);

        // Add the button to the frame
        getContentPane().add(button);

        // Set frame size and visibility
        setSize(300, 200);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            JOptionPane.showMessageDialog(this, "Button clicked!");
        }
    }

    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
    }
}