
public class CoffeeTouchscreenApapter implements CoffeeMachine {
	 private OldCoffeeMachine Oldcoffee;  
	 
	 public CoffeeTouchscreenApapter (OldCoffeeMachine oldcoffee){ 
		 this.Oldcoffee = oldcoffee; } 
	
	 
	 
	 public int chooseFirstSelection(){ 
		return Oldcoffee.selectA(); 
		 
		 }
	 
	 public int chooseSecondSelection(){ 
		 return Oldcoffee.selectB(); 
		 }
	
	
}
