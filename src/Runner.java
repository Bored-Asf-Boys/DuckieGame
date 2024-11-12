import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

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
        jp.setFocusable(true);
        
        InputManager inputManager = new InputManager(jp);
        
        Entity entity = new Entity(frame, jp);
        while (true)
        {
        	if (inputManager.keyHeld(65))
        	entity.move(0.0000001, 0);	
        }
	}
}
