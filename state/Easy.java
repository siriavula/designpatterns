import java.util.*;
/**
 * This class is created for the easy level state.
 * 
 * @author Siri Avula
 */
public class Easy implements State {

    /**
     * These are two instance variables ArithemeticGame game and Random r.
     * The ArithemeticGame game creates an instance of the ArithemeticGame object.
     * We initialized the Random variable r to be used in generating random numbers.
     */
    private ArithemeticGame game;
    private Random r = new Random();

    /**
     * This is the public constructor for our Easy class.
     * @param game is the game parameter that will be input into the easy state
     */
    public Easy(ArithemeticGame game) {
        this.game = game;
    }

    /**
     * This method gets us a random number chosen between 1 and 10.
     * @return returns a random number
     */
    public int getNum() {
        int num = r.nextInt(10) + 1;
        return num;
    }

    /**
     * This method gets us a random operation chosen between addition and subtraction.
     * @return returns a random operation
     */
    public String getOperation() {
        String[] operation = {"+", "-"};
        int i = r.nextInt(2);
        String operationStr = operation[i];
        return operationStr;
    }

    /**
     * This method levels up to the medium state from the easy state.
     */
    public void levelUp() {
        System.out.println("You've been advanced to the medium mode.");
        game.setState(game.getMediumState());
    }

    /**
     * This method lets the user know they should study before proceeding.
     */
    public void levelDown() {
        System.out.println("You seem to be struggling, you may want to study.");
    }

}
