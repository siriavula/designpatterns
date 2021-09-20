/**
 * This class represents the information for the Tiny Home Plan and extends to HousePlan.
 */
public class TinyHomePlan extends HousePlan{
    /**
     * This constructor sets values for the Tiny Home Plan passing through super.
     */
    public TinyHomePlan() {
        super(1, 5, 200);
    }

    /**
     * This method adds all of the materials to the materials ArrayList for tiny home.
     */
     protected void setMaterials() {
        materials.add("- Lumber");
        materials.add("- Insulation");
        materials.add("- Metal Roofing");
        materials.add("- Hardware");
    }

    /**
     * This method adds all of the features to the features ArrayList for tiny home.
     */
    protected void setFeatures() {
        features.add("- Natural Light");
        features.add("- Creative Storage");
        features.add("- Multipurpose areas");
        features.add("- Multi-use applications");
    }

    /**
     * This method returns the string of the Tiny House and the super toString. We also call the setMaterials and setFeatures methods to add in the strings to the ArrayList.
     */
    public String toString() {
        setMaterials();
        setFeatures();
        return "Tiny House\n" + super.toString();
    }

}
