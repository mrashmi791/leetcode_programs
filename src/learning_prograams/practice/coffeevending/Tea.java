package learning_prograams.practice.coffeevending;
public class Tea implements ProvideDrinks {
	
	private int suggerrInSpoon;
	private int milkInCup;
	private int waterInCup;
	private int teaInSpoon;
	

	public Tea(int suggerrInSpoon, int milkInCup, int waterInCup, int teaInSpoon) {
		super();
		this.suggerrInSpoon = suggerrInSpoon;
		this.milkInCup = milkInCup;
		this.waterInCup = waterInCup;
		this.teaInSpoon = teaInSpoon;
	}


	public int getTeaInSpoon() {
		return teaInSpoon;
	}


	public void setTeaInSpoon(int teaInSpoon) {
		this.teaInSpoon = teaInSpoon;
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


	@Override
	public void drink() {
		System.out.println("Serve Tea..!! using "+ this.waterInCup +" Cup water and "+ this.milkInCup + " Cup milk and "+ this.suggerrInSpoon +" spoon suger and " +this.teaInSpoon +" spoon tea" );
	}
	
	

}