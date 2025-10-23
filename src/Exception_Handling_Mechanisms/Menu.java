package Exception_Handling_Mechanisms;

public class Menu {

	void displayMenuOption(int opt) throws InvalidOptionException {
		if (opt < 1 || opt > 3)
			throw new InvalidOptionException("The option must be between 1 and 3 inclusive");
			
				System.out.println("Menu option "+ opt +" selected");
		
	}
}
