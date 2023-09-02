package polymor;

public class method_overidding extends method_overloading {
	public void ABC(int a,int b) {
		int total=a+b;
		System.out.println(total);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method_overidding abc=new method_overidding();
		abc.ABC(4,5);
		
	}

} 
