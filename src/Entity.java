import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Entity
{
	private double x;
	private double y;
	private int w;
	private int h;
	private JPanel panel;
	private Color color;
	
	Entity(JFrame frame, JPanel jp) {
		this.x = 0;
		this.y = 0;
		this.w = 100;
		this.h = 100;
		this.color = Color.white;
		
		this.panel = new JPanel();  
		panel.setBackground(color);
		panel.setBounds((int)x, (int)y, w, h);
		
		jp.add(panel);
		frame.setVisible(true);
	}
	
	void move(double x, double y)
	{
		this.x += x;
		this.y += y;
		
		panel.setBounds((int)this.x, (int)this.y, w, h);
	}
}