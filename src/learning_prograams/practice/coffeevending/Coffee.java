package learning_prograams.practice.coffeevending;
public class Coffee implements ProvideDrinks {

	private int suggerrInSpoon;
	private int milkInCup;
	private int waterInCup;
	private int coffeeBeans;

	public Coffee(int suggerrInSpoon, int milkInCup, int waterInCup, int coffeeBeans) {
		super();
		this.suggerrInSpoon = suggerrInSpoon;
		this.milkInCup = milkInCup;
		this.waterInCup = waterInCup;
		this.coffeeBeans = coffeeBeans;
	}

	public int getSuggerrInSpoon() {
		return suggerrInSpoon;
	}

	public void setSuggerrInSpoon(int suggerrInSpoon) {
		this.suggerrInSpoon = suggerrInSpoon;
	}

	public int getMilkInCup() {
		return milkInCup;
	}

	public void setMilkInCup(int milkInCup) {
		this.milkInCup = milkInCup;
	}

	public int getWaterInCup() {
		return waterInCup;
	}

	public void setWaterInCup(int waterInCup) {
		this.waterInCup = waterInCup;
	}

	public int getCoffeeBeans() {
		return coffeeBeans;
	}

	public void setCoffeeBeans(int coffeeBeans) {
		this.coffeeBeans = coffeeBeans;
	}

	@Override
	public void drink() {
		System.out.println("Serve coffee..!! using " + this.waterInCup + " Cup water and " + this.milkInCup
				+ " Cup milk and " + this.suggerrInSpoon + " spoon suger and " + this.coffeeBeans +" gm coffee beans");
	}

}