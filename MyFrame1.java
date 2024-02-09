import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Inheritance
//  Inheritance is a fundamental concept in Object-Oriented Programming (OOP) that allows a class to inherit
//  properties and behaviors (fields and methods) 
// from another class. When one class extends another class, it establishes an "IS-A" relationship between them.
public class MyFrame1 extends JFrame implements ActionListener {
    private JButton button;

    // Constructor Creation
    // In the MyFrame class, the constructor plays a crucial role in setting up the
    // initial state of the frame.
    // Its purpose is to initialize the frame, configure its properties, and prepare
    // it for use in your GUI
    // application.
    public MyFrame1() {
        setTitle("Java Button");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // In Java, when you want to add a JButton to an
        // instance of a class, you typically use composition to
        // establish a "HAS-A" relationship between the class and the button. In other
        // words,the class contains an instance of the JButton, and this relationship is
        // often
        // referred to as a "HAS-A" relationship.
        button = new JButton("Click Me");

        // In the MyFrame class, you can implement the ActionListener interface to
        // handle button click events.
        button.addActionListener(this);

        add(button);
    }

    // Overriding the actionPerformed method inside the MyFrame class is a
    // demonstration of polymorphism in Java.
    // Polymorphism is one of the core principles of Object-Oriented Programming
    // (OOP) and it allows objects of
    // different classes to be treated as objects of a common superclass. It also
    // enables a single method to have
    // different implementations in different classes.
    @Override
    public void actionPerformed(ActionEvent e) {

        System.out.println("Button clicked!");

    }

    public static void main(String[] args) {

        MyFrame frame = new MyFrame();

        // Make the frame visible
        frame.setVisible(true);
    }
}
