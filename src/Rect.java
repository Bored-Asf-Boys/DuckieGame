
public class Rect
{
	public Point position;
	public Point size;
	
	public Point getCenter()
	{
		return position.sub(size.div(2));
	}
}
