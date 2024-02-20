/**
 * Author: Derron
 * Tittle:Bread
 * Date: 2/19/2023
 * Version 1.0
 */
// Bread.java
public class Bread {
    private String breadName;
    private String ingredients;
    private String instructions;
    private boolean baked;

    //Constructor
    public Bread(String breadName, String ingredients, String instructions) {
        this.breadName = breadName;
        this.ingredients = ingredients;
        this.instructions = instructions;
        this.baked = false;
    }

   //Method to bake the bread
    public void bake() {
        if (!baked) {
            baked = true;
            System.out.println("Baking " + breadName + "...");
            System.out.println(breadName + " is now baked.");
        } else {
            System.out.println(breadName + " is already baked.");
        }
    }

   //Getter for ingredients
    public String getIngredients() {
        return ingredients;
    }
//setter for ingredients
    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }
    //getter for instructions
    public String getInstructions() {
        return instructions;
    }
    // setter for instructions
    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }
    //getter for breadName
    public String getBreadName() {
        return breadName;
    }
    //setter for BreadName
    public void setBreadName(String breadName) {
        this.breadName = breadName;
    }
    //getter for baked
    public boolean isBaked() {
        return baked;
    }
    //setter for baked
    public void setBaked(boolean baked) {
        this.baked = baked;
    }
    // toString() method overridden to provide a string representation of the Bread object
    @Override
    public String toString() {
        return "Bread{" +
                "breadName='" + breadName + '\'' +
                ", ingredients='" + ingredients + '\'' +
                ", instructions='" + instructions + '\'' +
                ", baked=" + baked +
                '}';
    }
}