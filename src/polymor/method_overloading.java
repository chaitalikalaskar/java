package polymor;

public class method_overloading {
	public void ABC() {
	System.out.println("chaitali");
	}
	public void ABC(String name) {
		System.out.println(name);
	}
	public void ABC(int a,int b) {
		int total=a+b;
		System.out.println(total);
	}
	
	public static void main(String[] args) {
		method_overloading obj=new method_overloading();
				obj.ABC("Chaitali");
				obj.ABC("Metange");
				obj.ABC( 78,89);
		
	}
}
