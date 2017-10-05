
public class TestMyInteger {

	public static void main(String[] args) { 
	MyInteger test = new MyInteger(155);
	System.out.println(test.getInt());
	System.out.println(test.isEven());
	System.out.println(test.isOdd());
	System.out.println(test.isPrime());
	System.out.println(MyInteger.isEven(5));
	System.out.println(MyInteger.isOdd(15));
	System.out.println(MyInteger.isPrime(17));
	System.out.println(MyInteger.isEven(new MyInteger(25)));
	System.out.println(MyInteger.isOdd(new MyInteger(55)));
	System.out.println(MyInteger.isPrime(new MyInteger(1807)));
	System.out.println(test.equals(155));
	System.out.println(test.equals(new MyInteger(154)));
	System.out.println(MyInteger.parseInt("1998"));
	}

}
