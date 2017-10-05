import java.util.Comparator;

public class CompareY implements Comparator<Point>{
	@Override
	public int compare(Point a, Point b) {
		double ay = a.getY();
		double by = b.getY();
			if(ay>by)
				return 1;
			else if(ay<by)
				return -1;
			else
				return compareX(a,b);
		}
	
	public int compareX(Point a, Point b)
	{
		double ax = a.getX();
		double bx = b.getX();
		if(ax>bx)
			return 1;
		else if(ax<bx)
			return -1;
		else
			return 0;
	}
	}


