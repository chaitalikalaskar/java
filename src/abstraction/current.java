package abstraction;

public class current extends bank {

	public static void main(String[] args) {
		current cu=new current();
		cu.withdraw(5400);
		cu.intrest();
		cu.getbalance();
	}

	@Override
	public void withdraw(int a) {
		// TODO Auto-generated method stub
		System.out.println("withdraw amount"+a);
	}

	@Override
	public void intrest() {
		// TODO Auto-generated method stub
		int b=788;
		System.out.println("interest is"+b);
		
	}

	@Override
	public void getbalance() {
		// TODO Auto-generated method stub
		System.out.println("blance is 4800");
		
	}

}
