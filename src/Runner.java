import java.awt.Color;
import java.awt.Dimension;

import javax.swing.*;

public class Runner
{
	static public JFrame frame;
	static public JPanel jp;
	
	public static void main(String args[])
	{
		frame = new JFrame("I'm a JFrame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 1000);
        jp = new JPanel();
        jp.setLayout(null);
        jp.setBackground(Color.black);
        frame.add(jp);
        
        Entity entity = new Entity(frame, jp);
        while (true)
        {
        	entity.move(0.0000001, 0);	
        }
	}
}
