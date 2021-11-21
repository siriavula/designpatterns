/**
 * This is the interface for State and it has four methods.
 * 
 * @author Siri Avula
 */
public interface State {
    /**
     * This method gets us a random number in a certain range depending on the state level.
     * @return a number that will be used in asking the user a Arithmetic question for the Arithemtic game.
     */
    public int getNum();

    /**
     * This method gives us a random operation depending on the state level.
     * @return returns an operation as a String
     */
    public String getOperation();

    /**
     * This method levels up to the next state depending on the current state.
     */
    public void levelUp();

    /**
     * This method levels down to the previous state depending on the current state.
     */
    public void levelDown();
}
