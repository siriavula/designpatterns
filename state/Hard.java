import java.util.Random;
/**
 * This class is created for the hard level state.
 * 
 * @author Siri Avula
 */
public class Hard implements State {
    
    /**
     * These are two instance variables ArithemeticGame game and Random r.
     * The ArithemeticGame game creates an instance of the ArithemeticGame object.
     * We initialized the Random variable r to be used in generating random numbers.
     */
    private ArithemeticGame game;
    private Random r = new Random();

    /**
     * This is the public constructor for our Hard class.
     * @param game is the game parameter that will be input into the hard state
     */
    public Hard(ArithemeticGame game) {
        this.game = game;
    }

    /**
     * This method gets us a random number chosen between 1 and 100.
     * @return returns a random number
     */
    public int getNum() {
        int num = r.nextInt(100) + 1;
        return num;
    }

    /**
     * This method gets us a random operation chosen between addition, subtraction, multiplication, and division.
     * @return returns a random operation
     */
    public String getOperation() {
        String[] operation = {"+", "-", "*", "/"};
        int i = r.nextInt(4);
        String operationStr = operation[i];
        return operationStr;
    }

    /**
     * This method lets the user know they are doing well!
     */
    public void levelUp() {
        System.out.println("You are doing so well!!!");
    }

    /**
     * This method levels down to the medium state from the hard state.
     */
    public void levelDown() {
        System.out.println("You are struggling, let's go to medium mode.");
        game.setState(game.getMediumState());
    }

}
