import java.util.Scanner;

public class TestComplex {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first complex number (in form a+bi): ");
		String first = scan.nextLine();
		
			
		//System.out.println(first);
		System.out.println("Enter second complex number (in form a+bi): ");
		String second = scan.nextLine();
		scan.close();
		String[] breakdownOne = first.split(" ");
		String[] breakdownTwo = second.split(" ");
		double firstReal = Double.parseDouble(breakdownOne[0]);
		double firstImaginary = Double.parseDouble(breakdownOne[1] + breakdownOne[2].substring(0, breakdownOne[2].length()-1));
		double secondReal = Double.parseDouble(breakdownTwo[0]);
		double secondImaginary = Double.parseDouble(breakdownTwo[1] + breakdownTwo[2].substring(0, breakdownTwo[2].length()-1));
		
		Complex one = new Complex(firstReal, firstImaginary);
		Complex two = new Complex(secondReal, secondImaginary);
		//System.out.println(one);
		System.out.println("Addition: " + one.add(two));
		System.out.println("Subtraction: " + one.subtract(two));
		System.out.println("Multiplication: " + one.multiply(two));
		System.out.println("Division: " + one.divide(two));
		
	}

}
