package p1;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TicTacToeTest
{
	public static void main(String[] args) 
	{	
        //Set up the content pane.
		JFrame frame = new JFrame("Test");
		GridLayout layout = new GridLayout(3,3,3,3);
		JPanel test = new JPanel();
		JButton but1 = new JButton(" ");
		JButton but2 = new JButton(" ");
		JButton but3 = new JButton(" ");
		JButton but4 = new JButton(" ");
		JButton but5 = new JButton(" ");
		JButton but6 = new JButton(" ");
		JButton but7 = new JButton(" ");
		JButton but8 = new JButton(" ");
		JButton but9 = new JButton(" ");
		test.setLayout(layout);
		test.add(but1);
		test.add(but2);
		test.add(but3);
		test.add(but4);
		test.add(but5);
		test.add(but6);
		test.add(but7);
		test.add(but8);
		test.add(but9);
		frame.add(test);
		but1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				but1.setText("X");
				but1.setFont(new Font("Arial", Font.PLAIN, 40));
			}
		});
        //Display the window.
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension(300, 300));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
	}
}
