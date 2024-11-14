import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class InputManager extends JFrame implements KeyListener {	
	static private Map<Integer, Boolean> keysHeld;
	
	InputManager(JPanel jp) 
	{
		jp.addKeyListener(this);
		
		 this.keysHeld = new HashMap<>();
	}
	
    @Override
    public void keyPressed(KeyEvent e) {
        keysHeld.put(e.getKeyCode(), true);
    }

    @Override
    public void keyReleased(KeyEvent e) {
    	keysHeld.put(e.getKeyCode(), false);
    }

	@Override
	public void keyTyped(KeyEvent e)
	{
		// TODO Auto-generated method stub
		
	}
	
	public boolean keyHeld(int keyCode)
	{
		if (keysHeld.get(keyCode) == null)
		{	
			return false;
		}
		
		return keysHeld.get(keyCode);
	}
}