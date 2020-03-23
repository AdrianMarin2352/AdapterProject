import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CoffeeTestCase {

	@Test
	void testselectA() {
		
		OldCoffeeMachine old = new OldCoffeeMachine();
		CoffeeTouchscreenApapter tester = new CoffeeTouchscreenApapter(old);
		
		assertEquals(1,tester.chooseFirstSelection());
		
		
	}
	
	@Test
	void testselectB() {

		OldCoffeeMachine old = new OldCoffeeMachine();
		CoffeeTouchscreenApapter tester = new CoffeeTouchscreenApapter(old);
		
		assertEquals(0,tester.chooseSecondSelection());
		
		
		
		
	}
	
	
	
	
	
	
}
