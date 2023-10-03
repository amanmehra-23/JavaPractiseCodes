import javax.swing.*;

class LabelExample {
    public static void main(String args[]) {
        JFrame f = new JFrame("Label Example"); // Create a new JFrame window

        JLabel l1, l2; // Create two JLabels
        l1 = new JLabel("First Label."); // Create the first label with text "First Label."
        l1.setBounds(50, 50, 100, 30); // Set the position and size of the first label

        l2 = new JLabel("Second Label."); // Create the second label with text "Second Label."
        l2.setBounds(50, 60, 100, 30); // Set the position and size of the second label

        f.add(l1); // Add the first label to the JFrame
        f.add(l2); // Add the second label to the JFrame

        f.setSize(300, 300); // Set the size of the JFrame
        f.setLayout(null); // Set the layout manager of the JFrame to null
        f.setVisible(true); // Set the JFrame to be visible
    }
}
