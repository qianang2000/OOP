package rattytouille;

/**
 * This is the Chef class, which knows how to make food.
 */
public class Chef {

  /**
   * The constructor, which gets called whenever a new instance of Chef is made.
   */
  public Chef(String name) {
    // create a chef every time an instance of Chef is made.
    this.createChef(name);


    // We want every instance of Chef to be ready to make food! That's why we
    // call this method in the constructor.
    this.getReady();
  }

  /**
   * This method creates a new Chef whose name is the string passed in
   * as a parameter. Don't worry about the "public" keyword for now,
   * we'll come back to it later in the class.
   * @param name : name to give the Chef
   */
  public void createChef(String name) {
    System.out.println("A new Chef named " + name + " has been made.");
  }

  /**
   * This method prints out this chef getting ready. Like with createChef,
   * don't worry about the "public" keyword here too
   */
  public void getReady() {
    System.out.println("Washing hands, putting on an apron, and prepping the " +
        "kitchen...");
  }

  public void makeFood(String foodToMake) {
    System.out.println("Making " + foodToMake + "!");
  }
}
