import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Entity
{
	public Rect rect;

	private Map<String, Component> components;

	Entity()
	{
		this.rect = new Rect();
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
}