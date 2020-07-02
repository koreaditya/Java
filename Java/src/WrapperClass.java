
public class WrapperClass {
	public static void main(String[] args) {
		
		int num=100;  
		Integer obj=Integer.valueOf(num);  

		System.out.println(obj); 
		
		int primitive = obj.intValue();

		System.out.println(primitive);
		
		Integer i = Integer.valueOf(10); 
        Double d = Double.valueOf(10.5); 
        Character ch = Character.valueOf('a'); 
        
        System.out.println(i);
        System.out.println(d);
        System.out.println(ch);
        
        String numString = obj.toString();
        System.out.println(numString);
        
	  }

}
