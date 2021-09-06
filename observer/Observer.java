/**
 * This is the Observer interface which provides the update 
 * and display methods implemented by the Store and Customer classes
 */
public interface Observer {
    public void update(Book book);
    public void display();
}
