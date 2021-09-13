/**
 * This class creates the hat decoration.
 */
public class Hat extends CharacterDecorator{
    
    /**
     * This method is the constructor for the Hat class.
     */
    public Hat(Character character) {
        super(character);
        this.character = character;
    }

    /**
     * This method changes the decoration in the sections to display hat.
     */
    public void customize() {
        sections.set(0,  "    ____\n __|____|____");
    }
}
