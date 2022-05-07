package arraylist4;

import java.util.ArrayList;

public class stringwala_array {

	public static void main(String[] args) {
		ArrayList<String>a1 = new ArrayList<>();
		a1.add("bhushan");
		a1.add("sarang");
		a1.add(1,"ram");
		System.out.println(a1);
	
	    int length =a1.size();
	    for (int i=length-1;i>=0;i--) {
	    String c=a1.get(i);
	   
	    System.out.print(c +" ");
	    }
	
	}
	
       
}
