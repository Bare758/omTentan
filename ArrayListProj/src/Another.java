
 import java.util.ArrayList;
import java.util.Collections;


	public class Another {

   public static void main(String []args) {
    
	   //uppgift 1 TextLängder//
	   
	    ArrayList<String> Cars = new ArrayList<String>(); { 

		Cars.add("Fiat");
		Cars.add("Ferrari");
		Cars.add("lamborgini");

		System.out.println("The size of MY CAR collecions is " + Cars.size());
		System.out.println("The first one is " + Cars.get(0));
		System.out.println("The second one is " + Cars.get(1));
		System.out.println("And the last one is " + Cars.get(2));
		int largestString = Cars.get(0).length();
		int index = 0;

		for (int i = 0; i < Cars.size(); i++) {
			if (Cars.get(i).length() > largestString) {
				largestString = Cars.get(i).length();
				index = i;
			}
		}
		System.out.println(
				"Index " + index + " " + Cars.get(index) + " " + "is the largest and is size is " + largestString);

	}
	
}
	  
	   
    
	}     
   
	

	   
	   
    
		       
	   
	
    
	 
	  
	   
	 




	
    		
	
	   
	  
	

	   
   
    		
    
    
    
    
    
   
	
	
	
