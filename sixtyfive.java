//Write java program to create a registration form. Take Login id and Password from the user and display it on the third Text Field which appears only on clicking OK button and clear both the Text Fields on clicking RESET button.



import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Main
{
	public static void main(String args[])
	{
		JFrame frame=new JFrame();
		frame.setTitle("Registration Form ");
		frame.setSize(420,420);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(Color.GREEN);
		frame.setLocation(500,500);
	}
}
