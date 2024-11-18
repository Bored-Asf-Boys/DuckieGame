import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;

import javax.swing.*;

public class Runner
{
	static public JFrame frame;
	static public JPanel jp;
	
	static private long beginTime;
	static public double deltaTime;
	
	static public InputManager inputManager;
	
	static public ArrayList<Entity> entities;
	
	public static <C extends Component> ArrayList<Entity> getEntitiesWithComponent(Class<C> componentType)
	{
		ArrayList<Entity> entitesWithComponent = new ArrayList<Entity>();
		
		for (Entity entity : entities)
		{
			if (entity.checkComponent(componentType))
			{
				entitesWithComponent.add(entity);
			}
		}
		
		return entitesWithComponent;
	}
	
	public static void main(String args[])
	{
		frame = new JFrame("Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 1000);
        jp = new JPanel();
        jp.setLayout(null);
        jp.setBackground(Color.black);
        frame.add(jp);
        jp.setFocusable(true);
        
    	beginTime = System.nanoTime();
    	deltaTime = 0;
        
    	inputManager = new InputManager(jp);
    	entities = new ArrayList<Entity>();
        
        Entity entity = new Entity();
        entity.rect.size.set(100, 100);
        entity.addComponent(new Sprite(entity));
        entity.addComponent(new Physics(entity));
        
        Entity ground = new Entity();
        ground.rect.size.set(500, 100);
        ground.rect.position.set(250, 800);
        ground.addComponent(new Sprite(ground));
        ground.addComponent(new Solid(ground));
        
        double speed = 25;
        
        while (true)
        {
        	entity.update();
        	ground.update();
        	
        	
        	
        	deltaTime = (double)(System.nanoTime() - beginTime) / 100000000.0;
        	beginTime = System.nanoTime();
        }
	}
}
