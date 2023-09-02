package abstraction;

public abstract class bank {
	public bank(){
		System.out.println("Bank Constructor");//constructor
	}
	public void deparment(){//
		
		System.out.println(" loan department");//normal method
	}
	public static void customer() {
		System.out.println("static method");//static method
	}
	
	public abstract void withdraw(int a);
	public abstract void intrest();
	//public abstract void getbalance();
	
}
