import java.util.*;

public class BinarySearch implements SearchBehavior {

    public boolean contains(ArrayList<String> data, String item) {
        int a = 0;
        int b = data.size() - 1; 

        while(a <= b) {
            int c = 1 + (b - 1) / 2;

            int res = item.compareTo(data[c]);
        }

        if(a == bsArray[d]) {
            return d;
        }

        else if(a < bsArray[d]) {
            return binarySearch(bsArray, a, b, d - 1);
        }

        else {
            return binarySearch(bsArray, a, d + 1, c);
        }
    }
}
