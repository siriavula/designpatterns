import java.util.*;

/**
 * This class is the Store class that provides 
 * our best sellers list and implements the 
 * Observer class.
 */ 
public class Store implements Observer {
    
    private Subject subject;
    private String title;
    private Queue<Book> bestSellers;

    /**
    * Defining the variables 
    */
    public Store(Subject subject) {
        this.subject = subject;
        this.title = title;
        Queue<Book> bestSellers = new QueueStore();
    }
    
    /**
     * Updates the book in the list using the enqueue method from the QueueStore class
     */
    public void update(Book book) {
        bestSellers.enqueue(book);
    }
    
    /**
     * Displays the output of the best sellers list
     */
    public void display() {
        bestSellers.print();
    }

}
