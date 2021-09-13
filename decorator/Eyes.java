/**
 * This class creates the eyes decoration.
 */
public class Eyes extends CharacterDecorator {
    
    /**
     * This method is the constructor for the Eyes class.
     */
    public Eyes(Character character) {
        super(character);
        this.character = character;
    }

    /**
     * This method changes the decoration in the sections to display eyes.
     */
    public void customize() {
        sections.set(2, " |  o  o  | ");
    }
}
