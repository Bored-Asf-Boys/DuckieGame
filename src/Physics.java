import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class Physics extends Component
{
	final private double GRAVITY = 30;
	Point velocity;
	Entity entity;
	
	Physics(Entity entity)
	{
		super(entity);
		this.entity = entity;
		velocity = new Point();
	}
	
	
	@Override
	public void update()
	{
		Point move = new Point();
		velocity.y += (GRAVITY * Runner.deltaTime);
		
		if (Runner.inputManager.keyHeld(KeyEvent.VK_RIGHT))
    	{
    		move.x = 25;
    	}
    	if (Runner.inputManager.keyHeld(KeyEvent.VK_LEFT))
    	{
    		move.x = -25;
    	}
    	
    	if (Runner.inputManager.checkKeyPressed(KeyEvent.VK_SPACE))
    	{
    		velocity.y = -100;
    	}
    	
    	move = move.add(velocity).mult(Runner.deltaTime);
    	
    	entity.rect.move(move.x, 0);
		
		ArrayList<Entity> solids = Runner.getEntitiesWithComponent(Solid.class);
		for (Entity solid : solids)
		{
			if (!entity.rect.checkCollision(solid.rect))
			{
				continue;
			}
			
			velocity.set(0, velocity.y);
			
			if (move.x > 0)
			{
				entity.rect.position.x = solid.rect.position.x - entity.rect.size.x;
			}
			if (move.x < 0)
			{
				entity.rect.position.x = solid.rect.position.x + solid.rect.size.x;
			}
		}
		
		entity.rect.move(0, move.y);
		
		for (Entity solid : solids)
		{
			if (!entity.rect.checkCollision(solid.rect))
			{
				continue;
			}
			
			velocity.set(velocity.x, 0);
			
			if (move.y > 0)
			{
				entity.rect.position.y = solid.rect.position.y - entity.rect.size.y;
			}
			if (move.y < 0)
			{
				entity.rect.position.y = solid.rect.position.y + solid.rect.size.y;
			}
		}
	}
}