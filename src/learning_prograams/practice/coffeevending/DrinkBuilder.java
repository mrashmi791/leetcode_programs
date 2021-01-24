package learning_prograams.practice.coffeevending;
public class DrinkBuilder {
	ProvideDrinks drinkObj;
	DrinkBuilder(ProvideDrinks drink) {
		drinkObj = drink;
	}
	
	
	public void execute() {
		drinkObj.drink();
	}
}