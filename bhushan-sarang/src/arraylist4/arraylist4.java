package arraylist4;
import java.util.*;
public class arraylist4 {

	public static void main(String[] args) {
	 
		ArrayList<Integer>a1=new ArrayList<>();
		a1.add(20);
		a1.add(30);
		a1.add(40);
        
		a1.add(1,35);
        		
		System.out.println(a1);	
        System.out.println(a1.get(2));
        for (int i=0;i<a1.size();i++) {
        	int c = a1.get(i);
//        	if (a1.contains(35))
        	if (c==35){
        		System.out.println("bhushan");
        	}
    	else {
        		System.out.println("sarang");
        	}
        }
	
        int size =(a1.size());
        
           
        
        for (int i=0;i<size;i++) {
            int d =(a1.get(i))*2;
            a1.add(d);
           
	

        }
        System.out.println(a1);
}
}