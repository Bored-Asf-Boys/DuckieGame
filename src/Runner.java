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
        
        Entity entity = new Entity();
        entity.addComponent(new Sprite(entity));
        
        Sprite sprite = entity.getComponent(Sprite.class);
        System.out.println(entity.getComponent(Sprite.class).getColor());
        
        double speed = 0.000001 * 5;
        
        while (true)
        {
        	entity.update();
        	
        	if (inputManager.keyHeld(KeyEvent.VK_RIGHT))
        	{
        		entity.move(speed, 0);	
        	}
        	if (inputManager.keyHeld(KeyEvent.VK_LEFT))
        	{
        		entity.move(-speed, 0);	
        	}
        	if (inputManager.keyHeld(KeyEvent.VK_UP))
        	{
        		entity.move(0, -speed);	
        	}
        	if (inputManager.keyHeld(KeyEvent.VK_DOWN))
        	{
        		entity.move(0, speed);	
        	}	
        }
	}
}
