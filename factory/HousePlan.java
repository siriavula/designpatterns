import java.util.*;
/**
 * This is a public abstract class that keeps track of all the information for the House Plan.
 */
public abstract class HousePlan {
    /**
     * The two ArrayLists represents each of the strings that represent the materials and features used for each house.
     * numRooms, numWindows, and squareFeet all represent integer values for each of the houses.
     */
    protected ArrayList<String> materials;
    protected ArrayList<String> features;
    private int numRooms;
    private int numWindows;
    private int squareFeet;

    /**
     * This method is the constructor for the HousePlan abstract class, and it initializes the ArrayLists and the integer variables.
     * @param numRooms number of rooms
     * @param numWindows number of windows
     * @param squareFeet square footage of house plan
     */
    public HousePlan(int numRooms, int numWindows, int squareFeet) {
        super();
        this.materials = new ArrayList<String>();
        this.features = new ArrayList<String>();
        this.numRooms = numRooms;
        this.numWindows = numWindows;
        this.squareFeet = squareFeet;
    }

    /**
     * Calls the set materials and set features methods.
     */
    protected abstract void setMaterials();
    protected abstract void setFeatures();

    /**
     * This method returns a ArrayList of type string for the materials used in the house.
     * @return ArrayList of materials 
     */
    public ArrayList<String> getMaterials() {
        return this.materials;
    }

    /**
     * This method returns a ArrayList of type string for the features used in the house.
     * @return ArrayList of features 
     */
    public ArrayList<String> getFeatures() {
        return this.features;
    }
    /**
     * This method accesses the value for the number of rooms.
     * @return integer value of the number of rooms
     */
    public int getNumRooms() {
        return this.numRooms;
    }

    /**
     * This method accesses the value for the number of windows.
     * @return integer value of the number of windows
     */
    public int getNumWindows() {
        return this.numWindows;
    }

    /**
     * This method accesses the value for the number of squareFeet.
     * @return integer value of the number of rooms
     */
    public int getSquareFeet() {
        return this.squareFeet;
    }

    /**
     * This method returns all of the informatino for the houseplan with a string.
     */
    public String toString() {
        String result = "";
        result += "Square Feet: " + this.squareFeet + "\nRoom: " + this.numRooms + "\nWindows: " + this.numWindows;
        result += "\n\nMaterials:\n"; 
        for(String material : materials) {
            result += material + "\n";
        }
        result += "\nFeatures:\n";
        for(String feature : features) {
            result += feature + "\n";
        }
        return result;
    }
}