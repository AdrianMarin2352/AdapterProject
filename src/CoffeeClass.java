
public class CoffeeClass {

	public static void main(String[] args) {
		OldCoffeeMachine old = new OldCoffeeMachine();
		CoffeeTouchscreenApapter tester = new CoffeeTouchscreenApapter(old);
		
		tester.chooseFirstSelection();
		

	}

}
