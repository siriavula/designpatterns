import java.util.ArrayList;

public class GuestList {
    
    private String title;
    private ArrayList<String> people;
    private SearchBehavior searchBehavior;

    public GuestList(String title) {
        this.title = title;
        this.people = new ArrayList<>();
        this.searchBehavior = new LinearSearch();
    }

    public String getTitle() {
        return title;
    }

    public ArrayList<String> getList() {
        return people;
    }
    
    public boolean add(String person) {
        if(searchBehavior.contains(people, person))
            return false;  

        people.add(person);
        return true;
    }
    
    public boolean remove(String person) {
        if(searchBehavior.contains(people, person))
            return false;  

        people.remove(person);
        return true;
    }
    
    public void setSearchBehavior(SearchBehavior searchBehavior) {
        this.searchBehavior = searchBehavior;
    }

}
