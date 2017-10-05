import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Point implements Comparable<Point> {
private double x,y;
public static void main(String args[])
{
	Random r = new Random();
	ArrayList<Point> test = new ArrayList<Point>();
	for(int i = 0; i<100; i++)
	{
		double a = r.nextDouble();
		double b = r.nextDouble();
		test.add(new Point(a, b));
	}
	Collections.sort(test);
	System.out.println(test);
	Collections.sort(test, new CompareY());
	System.out.println(test);
}

public Point(double a, double b)
{
	x = a;
	y = b;
}
@Override
public int compareTo(Point other) {
	if(this.x>other.getX())
		return 1;
	else if(this.x<other.getX())
		return -1;
	else
		return compareY(other);
}
public double getX()
{
	return x;
}
public double getY()
{
	return y;
}

public int compareY(Point other)
{
	if(this.y>other.getY())
		return 1;
	else if(this.y<other.getY())
		return -1;
	else
		return 0;
}

public String toString()
{
	return "(" + this.x + "," + this.y + ")";
}


}
