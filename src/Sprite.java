import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Sprite extends Component
{
	private JPanel panel;
	private Color color;
	
	Sprite(Entity entity)
	{
		super(entity);
		
		this.color = Color.white;
		
		this.panel = new JPanel();  
		panel.setBackground(color);
		panel.setBounds((int)entity.x, (int)entity.y, entity.w, entity.h);	
		
		Runner.jp.add(panel);
		Runner.frame.setVisible(true);
	}
	
	Color getColor() 
	{
		return color;
	}
	
	@Override
	public void update()
	{
		panel.setBounds((int)entity.x, (int)entity.y, entity.w, entity.h);
	}
}
