import java.util.*;

public class LinearSearch implements SearchBehavior {
    
    public boolean contains(ArrayList<String> data, String item) {
        for(int i = 0; i < data.size(); i++) {
            if(data.get(i).equalsIgnoreCase(item.toUpperCase())) {
                return false;
            }
        }
        return true;
    }

}
