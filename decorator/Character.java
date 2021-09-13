import java.util.*;
/**
 * This is an abstract class for the character.
 */
public abstract class Character {
    
    /**
     * The ArrayList represents each of the strings that will make up the potatoe head.
     */
    protected ArrayList<String> sections;

    /**
     * This method is the constructor for the Character abstract class, and it initializes the ArrayList.
     */
    public Character() {
        this.sections = new ArrayList<>();
    }

    /**
     * This method draws the potatoe head using a loop to loop through the items in sections.
     */
    public void draw() {
        for (int i = 0; i < sections.size(); i++) {
            System.out.println(sections.get(i));
        }
    }
}
