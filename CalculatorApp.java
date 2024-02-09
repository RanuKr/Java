import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorApp extends JFrame implements ActionListener {
    private JTextField inputField1;
    private JTextField inputField2;
    private JButton calculateButton;
    private JTextField resultField;

    public CalculatorApp() {
        // Set up the frame
        setTitle("Simple Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        setLayout(new FlowLayout());

        // Create and add components
        inputField1 = new JTextField(10);
        inputField2 = new JTextField(10);
        calculateButton = new JButton("Calculate");
        resultField = new JTextField(10);

        resultField.setEditable(false); // Make the result field read-only

        add(inputField1);
        add(inputField2);
        add(calculateButton);
        add(resultField);

        // Register an action listener for the Calculate button
        calculateButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            // Get values from input fields and perform the calculation
            String s1 = inputField1.getText();

            Double d1 = Double.parseDouble(s1);

            String s2 = inputField2.getText();
            Double d2 = Double.parseDouble(s2);
            Double result = d1 + d2;

            // Display the result in the result field
            resultField.setText(result.toString());
        }

        catch (NumberFormatException ex) {
            // Handle invalid input (non-numeric)
            resultField.setText("Invalid input");
        }

    }

   public static void main(String[] args) {

        CalculatorApp ca = new CalculatorApp();
        ca.setVisible(true);
    }
}
