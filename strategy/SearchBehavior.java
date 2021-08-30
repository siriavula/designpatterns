import java.util.*;

public interface SearchBehavior {

  public static boolean contains(ArrayList<String> data, String item) {

   int l = 0;
   int r = data.size() - 1;

   while(l <= r) {

       int m = l + (r - 1) / 2;
       
       if(data.get(m) == item) {
           return true;
       }

   }
   
   return false;
   
}   
   
}
