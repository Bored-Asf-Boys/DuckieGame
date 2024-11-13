import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Sprite extends Component
{
	JFrame frame;
	JPanel jp;
	private JPanel panel;
	private Color color;
	
	Sprite(Entity entity, JFrame frame, JPanel jp)
	{
		super(entity);
		
		this.frame = frame;
		this.jp = jp;
		this.color = Color.white;
		
		this.panel = new JPanel();  
		panel.setBackground(color);
		panel.setBounds((int)entity.x, (int)entity.y, entity.w, entity.h);	
		
		jp.add(panel);
		frame.setVisible(true);
	}
	
	@Override
	public void update()
	{
		panel.setBounds((int)entity.x, (int)entity.y, entity.w, entity.h);
	}
}
