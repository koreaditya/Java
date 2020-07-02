
public class StaticExample {
	
	static int num1;
	static int num2;
	static{
	   num1 = 5;
	   num2 = 10;
	}
	
	static void multiply(){
		System.out.println(num1*num2);
	}
	
	public static void main(String[] args) {
		
		multiply();
		
	}

}
