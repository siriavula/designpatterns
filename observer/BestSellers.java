import java.util.*;
/**
 * This is the BestSellers class which implements Subject interface
 */
public class BestSellers implements Subject {
    
    private ArrayList<Observer> observers;
    private ArrayList<Book> bestSellers;

    /**
     * Defining the varaibles "observers" and "bestSellers"
     */
    public BestSellers() {
        observers = new ArrayList<Observer>();
        bestSellers = new ArrayList<Book>();
    }

    /**
     * This method will add the observer
     */
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * This method will remove the observer
     */
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * This method will add the book by notifying the observers
     */
    public void addBook(Book book) {
        notifyObservers(book);
    }

    /**
     * This method will notify the the observers using the update method
     */
    @Override
    public void notifyObservers(Book book) {
        for(Observer observer : observers) {
            observer.update(book);
        }
    }

    
}
