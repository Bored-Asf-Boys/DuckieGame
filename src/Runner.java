import java.awt.Color;
import java.awt.Dimension;

import javax.swing.*;

public class Runner
{
	static public JFrame frame;
	static public JPanel jp;
	
	public static void drawRect(int x, int y, int w, int h)
	{
		JPanel rectangle = new JPanel();   
        rectangle.setBackground( Color.white);   
        rectangle.setBounds(x, y, w, h);
        jp.add(rectangle);
        frame.setVisible(true);
	}
	
	public static void main(String args[])
	{
		frame = new JFrame("I'm a JFrame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 1000);
        jp = new JPanel();
        jp.setLayout(null);
        jp.setBackground(Color.black);
        frame.add(jp);
        
        drawRect(50, 50, 60, 30);
	}
}
