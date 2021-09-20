/**
 * This class represents the information for the Contemporary Home Plan and extends to HousePlan.
 */
public class ContemporaryPlan extends HousePlan {
    /**
     * This constructor sets values for the Contemporary Home Plan passing through super.
     */
    public ContemporaryPlan() {
        super(5, 40, 3000);
    }

    /**
     * This method adds all of the materials to the materials ArrayList for Contemporary home.
     */
    protected void setMaterials() {
        materials.add("- Ceramics");
        materials.add("- High-Strength Alloys");
        materials.add("- Composites");
    }

    /**
     * This method adds all of the features to the features ArrayList for Contemporary home.
     */
    protected void setFeatures() {
        features.add("- Oversized Windows");
        features.add("- Unconventional Roofs");
        features.add("- Minimalism");
        features.add("- Open Floor Plan");
    }

    /**
     * This method returns the string of the Contemporary Home and the super toString. We also call the setMaterials and setFeatures methods to add in the strings to the ArrayList.
     */
    public String toString() {
        setMaterials();
        setFeatures();
        return "Contemporary Home\n" + super.toString();
    }
}
