
public class Rect
{
	public Point position;
	public Point size;
	
	Rect()
	{
		this.position = new Point();
		this.size = new Point();
	}
	
	public Point getCenter()
	{
		return position.sub(size.div(2));
	}
	
	public void move(double x, double y)
	{
		move(new Point(x, y));
	}
	
	public void move(Point position)
	{
		this.position = this.position.add(position);
	}
}
