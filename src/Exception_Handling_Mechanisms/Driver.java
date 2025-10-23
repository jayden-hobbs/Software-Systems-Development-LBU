package Exception_Handling_Mechanisms;

public class Driver {

	public static void main(String[] args) {

		ArrayProcessor ap = new ArrayProcessor();
		int len = ap.getArrayLength(new int[] {4,2,5,3,5,2,64,34,3434,3432,644});
		System.out.println("Array length is "+len);
		
		Menu m = new Menu();
		try {
			m.displayMenuOption(1);
			m.displayMenuOption(2);
			m.displayMenuOption(3);
			m.displayMenuOption(4);

		} catch (InvalidOptionException e) {
			System.err.println("Menu option invalid: "+e.getMessage());
		}
	}

}
