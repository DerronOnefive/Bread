/**
 * Author: Derron
 * Tittle:Main
 * Date: 2/19/2023
 * Version 1.0
 */
// Main.java
public class Main {
    public static void main(String[] args) {
        Sourdough sourdough = new Sourdough();
        Muffins muffins = new Muffins();
        Pastries pastries = new Pastries();
        StrawberryShortCake shortcake = new StrawberryShortCake();
        Bagels bagels = new Bagels();

        System.out.println("Sourdough Bread Ingredients:");
        System.out.println(sourdough.getIngredients());
        System.out.println("\nSourdough Bread Instructions:");
        System.out.println(sourdough.getInstructions());
        sourdough.bake();

        System.out.println("\nMuffins Ingredients:");
        System.out.println(muffins.getIngredients());
        System.out.println("\nMuffins Instructions:");
        System.out.println(muffins.getInstructions());
        muffins.bake();

        System.out.println("\nPastries Ingredients:");
        System.out.println(pastries.getIngredients());
        System.out.println("\nPastries Instructions:");
        System.out.println(pastries.getInstructions());
        pastries.bake();

        System.out.println("\nStrawberry Shortcake Ingredients:");
        System.out.println(shortcake.getIngredients());
        System.out.println("\nStrawberry Shortcake Instructions:");
        System.out.println(shortcake.getInstructions());
        shortcake.bake();

        System.out.println("\nBagels Ingredients:");
        System.out.println(bagels.getIngredients());
        System.out.println("\nBagels Instructions:");
        System.out.println(bagels.getInstructions());
        bagels.bake();
    }
}
