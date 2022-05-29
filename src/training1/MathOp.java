package training1;

public class MathOp {
	public static void main(String[] args) {
		int i=12;
		int j=10;
		
		
		  System.out.println(i+j); System.out.println(i-j); System.out.println(i*j);
		  System.out.println(i/j); double m =(double)i / (double)j; 
		  System.out.println(m); System.out.println(i%j);
		 
		
	// increment operator	 
	// i = i+1
	//	i=i++   post increment== first assign and then increment
	//  i=++i   pre increment == first increment and then assign
		int k=1;
		k = i++ + ++i + i++ + ++i;
		System.out.println(k);
		System.out.println(i);
	// decrement operator
	// i = i--  // post decrement
	// i = --i  // pre decrement
		
	}
}
