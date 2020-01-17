 import java.util.ArrayList;


	public class Program {

   public static void main(String []args) {
	   
	   
	 //  public void testSortAscendingDescending() throws Exception {         
		    ArrayList<String> countryList = new ArrayList<>();         
		    countryList.add("France");         
		    countryList.add("USA");         
		    countryList.add("India");         
		    countryList.add("Spain");         
		    countryList.add("England"); 
		    
		    countryList.sort(String::compareToIgnoreCase);
		    System.out.println(countryList);
		    
		    
		    
		 
		  } 
		
       
   
    
   }
	
	    		
	    
	    
	  
   