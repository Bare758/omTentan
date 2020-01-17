import java.util.ArrayList;
import java.util.Arrays;

public class compare {

    private static ArrayList<String> list = new ArrayList<String>();

    public static void main(String[] args) {
        list.add("Abbe");
        list.add("ronaldo");

        System.out.println(list); 

        // If the list contains a string
            
        if (list.contains("Abbe")) {
                System.out.println("its a string");
           
        } else {
                System.out.println("not a string");
            }
            
        
            

    }

}
