import java.util.Random;
/**
 * This class is created for the medium level state.
 * 
 * @author Siri Avula
 */
public class Medium implements State {
    
    /**
     * These are two instance variables ArithemeticGame game and Random r.
     * The ArithemeticGame game creates an instance of the ArithemeticGame object.
     * We initialized the Random variable r to be used in generating random numbers.
     */
    private ArithemeticGame game;
    private Random r = new Random();

    /**
     * This is the public constructor for our Medium class.
     * @param game is the game parameter that will be input into the medium state
     */
    public Medium(ArithemeticGame game) {
        this.game = game;
    }

    /**
     * This method gets us a random number chosen between 1 and 50.
     * @return returns a random number
     */
    public int getNum() {
        int num = r.nextInt(50) + 1;
        return num;
    }

    /**
     * This method gets us a random operation chosen between addition, subtraction, and multiplication.
     * @return returns a random operation
     */
    public String getOperation() {
        String[] operation = {"+", "-", "*"};
        int i = r.nextInt(3);
        String operationStr = operation[i];
        return operationStr;
    }

    /**
     * This method levels up to the hard state from the medium state.
     */
    public void levelUp() {
        System.out.println("You've been advanced to the hardest mode.");
        game.setState(game.getHardState());
    }

    /**
     * This method levels down to the easy state from the medium state.
     */
    public void levelDown() {
        System.out.println("You are struggling, let's go to easy mode.");
        game.setState(game.getEasyState());
    }

}
