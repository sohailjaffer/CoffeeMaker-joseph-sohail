import java.util.concurrent.TimeUnit;

public class CoffeeMaker {

	/** Inventory in the coffee maker */
	private int coffee;
	private int milk;
	private int chocolate;

	/**
	 * Creates a coffee maker object with empty containers.
	 */
	public CoffeeMaker() {
		this.coffee = 0;
		this.milk = 0;
		this.chocolate = 0;
	}

	/**
	 * Returns the current number of chocolate units in 
	 * the coffee maker.
	 * @return int
	 */
	public int getChocolate() {
		return chocolate;
	}

	/**
	 * Returns the current number of coffee units in
	 * the coffee maker.
	 * @return int
	 */
	public int getCoffee() {
		return coffee;
	}

	/**
	 * Returns the current number of milk units in
	 * the coffee maker.
	 * @return int
	 */
	public int getMilk() {
		return milk;
	}

	/**
	 * Returns a string describing the current contents 
	 * of the inventory.
	 * @return String
	 */
	public String checkIngredients() {
		// TODO: code this method
		StringBuffer buf = new StringBuffer();
		buf.append("Not yet implemented");
		buf.append("\n");
		return buf.toString();
	}

	/**
	 * Cleanup coffee maker emptying all its content
	 */
	public void cleanup()  {
		
		// TODO: code this method
		System.out.println("Emptying Contents");
		System.out.println("%....%");
		System.out.println("Cleaning Up Coffee Maker");
		try {
			Thread.sleep(4000);
		}catch (InterruptedException ie) {
			Thread.currentThread().interrupt();
		}
	}


	/**
	 * Adds ingredients to the coffee maker
	 * @param amtCoffee
	 * @param amtMilk
	 * @param amtChocolate
	 * @return boolean
	 */
	public void addIngredients(int amtCoffee, int amtMilk, int amtChocolate) throws Exception {

		// TODO: code this method


	}

	/**
	 * Make an espresso and return the change, or
	 * the user's money if the espresso cannot be made.
	 * An espresso uses one unit of coffee and costs one pound.
	 * @param amtPaid
	 * @return int
	 */
	public int makeEspresso(int amtPaid) {
		// TODO: code this method
		int espressoChange=1;
		System.out.println("%...Making Espresso......%");

		int espresso = coffee- espressoChange;
		try {
			Thread.sleep(4000);
		}catch (InterruptedException ie) {
			Thread.currentThread().interrupt();
		}
		System.out.print("...Making Espresso...");
		System.out.print("...Espresso Made..");
		//return coffee.getCoffee();
		//Making espresso logic
		//Milk.addIngredients();


        //Price of espresso
		int change= amtPaid - espressoChange;
		if (amtPaid<1) {
			System.out.println("Insufficient funds to make latte.");
		} else {
			System.out.println("Thanks for purchasing");
		}
		System.out.println("Your change is: " + change + "\n");
		//System.out.println("Thanks for purchasing");
		/*if (change == amtPaid) {
			System.out.println("Insufficient funds to make espresso.");
		} else { try {
			Thread.sleep(1500);
		}catch (InterruptedException ie) {
			Thread.currentThread().interrupt();
		}
			System.out.println("Thanks for purchasing");
		}*/
		return change;
	}

	/**
	 * Make a latte and return the change, or
	 * the user's money if the latte cannot be made.
	 * A latte uses two units of coffee and one unit of milk.
	 * @param amtPaid
	 * @return int
	 */
	public int makeLatte(int amtPaid) {

		// TODO: code this method
		// TODO: code this method
		int latteChange=2;
		int latteCoffee=2;
		int latteMilk=1;
		System.out.println("%...Making Latte......%");
		try {
			Thread.sleep(4000);
		}catch (InterruptedException ie) {
			Thread.currentThread().interrupt();
		}

		System.out.print("...Latte Made..");
		//Making espresso logic
		//Milk.addIngredients();
		int latteC = coffee- latteCoffee;
		int latteM = milk-latteMilk;



		//Price of espresso

		int change= amtPaid - latteChange;
		System.out.println("Your change is: " + change + "\n");
		//System.out.println("Thanks for purchasing");
		if (amtPaid<2) {
			System.out.println("Insufficient funds to make latte.");
		} else {
			System.out.println("Thanks for purchasing");
		}
		return change;
		//return -1;
	}    
}
