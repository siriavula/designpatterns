import java.util.*;

public class LinearSearch implements SearchBehavior {
    
    public boolean contains(ArrayList<String> data, String item) {
        int left = 0;
        int right = data.size() - 1;
        int middle = left + (right - 1) / 2;
        int compare = item.compareTo(data.get(middle));
        
        if(compare == 0) {
            return true;
        }

        if(compare > 0) {
            left = middle + 1;
        }

        else {
            right = middle - 1;
        }
        
        return false;
    }

}
