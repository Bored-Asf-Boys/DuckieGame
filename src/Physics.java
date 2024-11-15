
public class Physics extends Component
{
	final private double GRAVITY = 15;
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
		velocity.y += (GRAVITY * Runner.deltaTime);
		entity.rect.move(velocity.mult(Runner.deltaTime));
	}
}