package abstraction;

public class saving extends bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 saving obj=new saving();
 obj.withdraw(5000);
 obj.getbalance();
 obj.intrest();

	} 

	

	@Override
	public void intrest() {
		int b=2000;
		// TODO Auto-generated method stub
		System.out.println("interest is"+b);
	}

	@Override
	public void getbalance() {
		// TODO Auto-generated method stub
		System.out.println("balance available 20000");
		
	}



	@Override
	public void withdraw(int a) {
		// TODO Auto-generated method stub
		System.out.println("withdraw amount"+a);
	}

}
