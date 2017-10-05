
public class TestAccount {

	public static void main(String args[]) {
		Account test = new Account();
		Account test1 = new Account(111178915, 3500);
		
		//print accounts
		System.out.println(test);
		System.out.println();
		System.out.println(test1);
		System.out.println();
		
		//withdraw
		test.withdraw(100);
		
		//deposit
		test1.deposit(500);
		
		//reprint accounts
		System.out.println(test);
		System.out.println();
		System.out.println(test1);
		System.out.println();
		test.withdraw(7000);
		
	}

}
