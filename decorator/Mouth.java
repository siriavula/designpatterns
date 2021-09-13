/**
 * This class creates the mouth decoration.
 */
public class Mouth extends CharacterDecorator{
    
    /**
     * This method is the constructor for the Mouth class.
     */
    public Mouth(Character character) {
        super(character);
        this.character = character;
        
    }

    /**
     * This method changes the decoration in the sections to display mouth.
     */
    public void customize() {
       sections.set(4, "  \\ ---- / ");
    }
}
