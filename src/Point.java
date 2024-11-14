
public class Point
{
	float x;
	float y;
	
	Point()
	{
		this.x = 0;
		this.y = 0;
	}
	
	Point(float x, float y)
	{
		this.x = x;
		this.y = y;
	}
	
	Point add(Point point)
	{
		return new Point(x + point.x, y + point.y);
	}
	
	Point sub(Point point)
	{
		return new Point(x - point.x, y - point.y);
	}
	
	Point mult(Point point)
	{
		return new Point(x * point.x, y * point.y);
	}
	
	Point div(Point point)
	{
		return new Point(x / point.x, y / point.y);
	}
	
	Point add(float number)
	{
		return new Point(x + number, y + number);
	}
	
	Point sub(float number)
	{
		return new Point(x - number, y - number);
	}
	
	Point mult(float number)
	{
		return new Point(x * number, y * number);
	}
	
	Point div(float number)
	{
		return new Point(x / number, y / number);
	}
}
