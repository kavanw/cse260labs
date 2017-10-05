import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class StoreLinkedList {
	public static void main(String args[])
	{
LinkedList<Integer> a = new LinkedList<>();
System.out.println(args.length);
for(int i = 0; i<args.length; i++)
{
	a.add(Integer.parseInt(args[i]));	
}

	a.sort(null);
	System.out.println(a);
	a.sort(Collections.reverseOrder());
	System.out.println(a);
	Collections.shuffle(a);
	System.out.println(a);
	}
}
