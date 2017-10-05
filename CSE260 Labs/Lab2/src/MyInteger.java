
public class MyInteger {
	private int value;
	public MyInteger(int value) {
		this.value = (Integer)(value);
	}

	public int getInt()
	{
		return value;
	}
	
	public boolean isEven()
	{
		return(value%2==0);
	}
	public boolean isOdd()
	{
		return !isEven();
	}
	
	public boolean isPrime()
	{
		boolean prime = true;
		int maxPossibleValue = (int) Math.sqrt((double)(value));
		//System.out.println(maxPossibleValue);
		for(int i = maxPossibleValue; i>2; i--)
			if(value%i==0)
				return false;
		return prime;
	}
	public static boolean isEven(int a)
	{
		MyInteger hold = new MyInteger(a);
		return hold.isEven();
	}
	public static boolean isOdd(int b)
	{
		MyInteger hold = new MyInteger(b);
		return hold.isOdd();
	}
	public static boolean isPrime(int c)
	{
		MyInteger hold = new MyInteger(c);
		return hold.isPrime();
	}
	
	public static boolean isEven(MyInteger a)
	{
		return a.isEven();
	}
	public static boolean isOdd(MyInteger b)
	{
		return b.isOdd();
	}
	public static boolean isPrime(MyInteger c)
	{
		return c.isPrime();
	}
	
	public boolean equals(int compare)
	{
		return value==compare;
	}
	public boolean equals(MyInteger compare)
	{
		return value==compare.getInt();
	}
	public static int parseInt(String integerVal) {
		String integers = "123456789";
		int number = 0;
		int total = 0;
		int add = 0;
		for(int m = 0; m<integerVal.length(); m++)
		{
			number = integers.indexOf(integerVal.substring(m,m+1))+1;
			add=integerVal.length()-1-m;
			total = total + (int) ((number)*Math.pow(10, add));
			
		}
		return total;
	}

}
