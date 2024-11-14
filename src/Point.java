
public class Point
{
	public double x;
	public double y;
	
	Point()
	{
		this.x = 0;
		this.y = 0;
	}
	
	Point(double x, double y)
	{
		this.x = x;
		this.y = y;
	}
	
	void set(double x, double y)
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
	
	Point add(double number)
	{
		return new Point(x + number, y + number);
	}
	
	Point sub(double number)
	{
		return new Point(x - number, y - number);
	}
	
	Point mult(double number)
	{
		return new Point(x * number, y * number);
	}
	
	Point div(double number)
	{
		return new Point(x / number, y / number);
	}
}
