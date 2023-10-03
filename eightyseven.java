import java.awt.event.*;
import javax.swing.*;

class ButtonExample {
    public static void main(String[] args) {
        JFrame f = new JFrame("Button Example"); // Create a new JFrame window
        final JTextField tf = new JTextField(); // Create a new JTextField
        tf.setBounds(50, 50, 150, 120); // Set the position and size of the text field

        JButton b = new JButton("Click Here"); // Create a new JButton with the text "Click Here"
        b.setBounds(50, 100, 95, 30); // Set the position and size of the button

        // Add an ActionListener to the button
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tf.setText("Welcome to Java."); // Set the text of the text field when the button is clicked
            }
        });

        f.add(b); // Add the button to the JFrame
        f.add(tf); // Add the text field to the JFrame
        f.setSize(400, 400); // Set the size of the JFrame
        f.setLayout(null); // Set the layout manager of the JFrame to null
        f.setVisible(true); // Set the JFrame to be visible
    }
}
