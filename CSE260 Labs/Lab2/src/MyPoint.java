
public class MyPoint {

	double x, y;
	public MyPoint() {
		x = 0;
		y = 0;
	}
	public MyPoint(double x, double y)
	{
		this.x = x;
		this.y = y;
	}

	public double getX()
	{
		return x;
	}
	public double getY()
	{
		return y;
	}
	
	public double distance(MyPoint point)
	{
		double diffInXSquared = Math.pow(point.getX() - x, 2);
		double diffInYSquared = Math.pow(point.getY() - y, 2);
		return Math.sqrt(diffInXSquared + diffInYSquared);
	}
	public double distance(int xpos, int ypos)
	{
		MyPoint newPoint = new MyPoint(xpos, ypos);
		return this.distance(newPoint);
	}
	}

