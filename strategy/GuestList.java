import java.util.ArrayList;

public class GuestList {
    
    private String title;
    private ArrayList<String> people;
    private SearchBehavior searchBehavior;

    public GuestList(String aTitle) {
        this.title = aTitle;
    }

    public String getTitle() {
        return this.title;
    }
    public ArrayList<String> getList() {
        return this.people;
    }
    
    public void setList(ArrayList<String> aPeople) {
        this.people = aPeople;
    }

    public boolean add(String aTitle) {
        return true;  
    }
    
    public boolean remove(String aTitle) {
        return true;
    }
    
    public void setSearchBehavior(SearchBehavior searchBehavior) {
        this.searchBehavior = searchBehavior;
    }

   

}
