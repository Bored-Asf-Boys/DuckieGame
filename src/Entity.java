import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Entity
{
	public double x;
	public double y;
	public int w;
	public int h;

	private Map<String, Component> components;

	Entity()
	{
		this.x = 0;
		this.y = 0;
		this.w = 100;
		this.h = 100;

		components = new HashMap<>();
	}

	public void update()
	{
		for (Map.Entry<String, Component> instance : components.entrySet())
		{
			instance.getValue().update();
		}
	}

	public <C extends Component> void addComponent(C component)
	{
		components.put(component.getClass().getName(), component);
	}
	
	public <C extends Component> C getComponent(Class<C> componentType)
	{
		return (C) components.get(componentType.getName());
	}

	void move(double x, double y)
	{
		this.x += x;
		this.y += y;
	}
}