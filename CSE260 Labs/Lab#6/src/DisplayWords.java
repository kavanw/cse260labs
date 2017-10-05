import java.io.File;
import java.util.PriorityQueue;
import java.util.Scanner;

public class DisplayWords {
	public static void main(String args[]) throws Exception
	{
	Scanner s = new Scanner(System.in);
	PriorityQueue<String> a=new PriorityQueue<>();
	
	
	File file = new File(s.next());
	Scanner read = new Scanner(file);
	String token;
	while(read.hasNext())
	{
		 token = read.next();
		if(token.substring(0,1).matches("[a-zA-z]"))
		{
			a.offer(token);
		}
	}
	int size = a.size();
	for(int i = 0; i<size; i++)
	{
		System.out.println(a.remove());
	}
	}
}

