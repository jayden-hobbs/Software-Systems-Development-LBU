package Exception_Handling_Mechanisms;

public class ArrayProcessor {
	
	public int getArrayLength(Object[] a) {
		int count = 0;
		
		try {
			while (true) {
				Object t = a[count];
				count++;
			}
		} catch (Exception e) {
			// does nothing as end of array
		}
		return count;
		
	}
}