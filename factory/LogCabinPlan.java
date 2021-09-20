/**
 * This class represents the information for the Log Cabin Plan and extends to HousePlan.
 */
public class LogCabinPlan extends HousePlan{
    
    /**
     * This constructor sets values for the Log Cabin Plan passing through super.
     */
    public LogCabinPlan() {
        super(2, 10, 1800);
    }

    /**
     * This method adds all of the materials to the materials ArrayList for Log Cabin.
     */
    protected void setMaterials() {
        materials.add("- Log Sliding");
        materials.add("- Board and Batten Siding");
        materials.add("- White Pine");
    }

    /**
     * This method adds all of the features to the features ArrayList for Log Cabin.
     */
    protected void setFeatures() {
        features.add("- Timbered Roof");
        features.add("- High Insulation");
        features.add("- Rustic Effect");
    }

    /**
     * This method returns the string of the Log Cabin and the super toString. We also call the setMaterials and setFeatures methods to add in the strings to the ArrayList.
     */
    public String toString() {
        setMaterials();
        setFeatures();
        return "Log Cabin\n" + super.toString();
    }

}