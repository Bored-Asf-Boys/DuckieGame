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
        double speed = 0.000001;
        
        while (true)
        {
        	if (inputManager.keyHeld(KeyEvent.VK_RIGHT))
        	{
        		entity.move(0.000001, 0);	
        	}
        	if (inputManager.keyHeld(KeyEvent.VK_LEFT))
        	{
        		entity.move(-0.000001, 0);	
        	}
        	if (inputManager.keyHeld(KeyEvent.VK_UP))
        	{
        		entity.move(0, -0.000001);	
        	}
        	if (inputManager.keyHeld(KeyEvent.VK_DOWN))
        	{
        		entity.move(0, 0.000001);	
        	}	
        }
	}
}
