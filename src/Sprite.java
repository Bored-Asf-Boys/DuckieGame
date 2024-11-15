import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Sprite extends Component {
    private JPanel panel;
    
    Sprite(Entity entity, String imagePath) {
        super(entity);
        
        ImageIcon icon = new ImageIcon(imagePath);
        
        Image image = icon.getImage().getScaledInstance(entity.w, entity.h, Image.SCALE_SMOOTH);
        icon = new ImageIcon(image);

        this.label = new JLabel(icon);
        label.setBounds((int) entity.x, (int) entity.y, entity.w, entity.h);
        
        Runner.jp.add(label);
        Runner.frame.setVisible(true);
    }

    @Override
    public void update() {
        label.setBounds((int) entity.x, (int) entity.y, entity.w, entity.h);
    }
}
