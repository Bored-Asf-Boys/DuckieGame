import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.time.Duration;
import java.time.Instant;

import javax.swing.*;

public class Runner
{
	static public JFrame frame;
	static public JPanel jp;
	
	static private long beginTime;
	static public double deltaTime;
	
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
        
    	beginTime = System.nanoTime();
    	deltaTime = 0;
        
        InputManager inputManager = new InputManager(jp);
        
        Entity entity = new Entity();
        entity.rect.size.set(100, 100);
        entity.addComponent(new Sprite(entity));
        
//        double speed = 0.000001 * 5;
        double speed = 25;
        
        while (true)
        {
        	entity.update();
        	
        	if (inputManager.keyHeld(KeyEvent.VK_RIGHT))
        	{
        		entity.rect.move(speed * deltaTime, 0);	
        	}
        	if (inputManager.keyHeld(KeyEvent.VK_LEFT))
        	{
        		entity.rect.move(-speed * deltaTime, 0);	
        	}
        	if (inputManager.keyHeld(KeyEvent.VK_UP))
        	{
        		entity.rect.move(0, -speed * deltaTime);	
        	}
        	if (inputManager.keyHeld(KeyEvent.VK_DOWN))
        	{
        		entity.rect.move(0, speed * deltaTime);	
        	}	
        	
        	deltaTime = (double)(System.nanoTime() - beginTime) / 100000000.0;
        	beginTime = System.nanoTime();
        }
	}
}
