package Exception_Handling_Mechanisms;

public class ArrayProcessor {
	
	public int getArrayLength(int[] is) {
		int count = 0;
		
		try {
			while (true) {
				Object t = is[count];
				count++;
			}
		} catch (Exception e) {
			// does nothing as end of array
		}
		return count;
		
	}
}