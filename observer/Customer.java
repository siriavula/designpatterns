import java.util.*;
/**
 * This class is the Customer class that provides 
 * the wish list and implements the Observer class.
 */

public class Customer implements Observer {
    
    private Subject subject;
    private String firstName;
    private String lastName;
    private ArrayList<Book> wishList;

    /**
     * Defining each of the variables: subject, firstName, lastName, wishList
     */
    public Customer(Subject subject, String firstName, String lastName) {
        this.subject = subject;
        subject.registerObserver(this);
        this.firstName = firstName;
        this.lastName = lastName;
        this.wishList = new ArrayList<>();
    }

    /**
     * This method updates the wish list by adding each book
     */
    public void update(Book book) {
        wishList.add(book);
    }

    /**
     * Displays the output of the wish list
     */
    public void display() {
        System.out.println("- " + subject + " by: " + firstName + " " + lastName);
    }
    
}
