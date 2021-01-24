package learning_prograams.practice.coffeevending;
public class CoffeTeaMain {

	public static void main(String[] args) {
		DrinkBuilder obj = new DrinkBuilder(new Tea(1,2,5, 2));
		obj.execute();
		
		DrinkBuilder obj2 = new DrinkBuilder(new Coffee(1,2,2,10));
		obj2.execute();

	}

}