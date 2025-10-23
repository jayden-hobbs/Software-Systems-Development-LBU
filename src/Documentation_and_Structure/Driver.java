package Documentation_and_Structure;

import java.util.Random;

/**
 * Entry point that generates random integers, in this case it is dry-coded as 10, it then stores them as an instance of Stats,
 * and then prints data about the array such as the average, smallest and largest value and the combined total
 */


public class Driver {

	/**
 	* Main method that creates an instance of fixed capacity, fills it with random integers and then outputs the numbers,
	* with a summary of the data
 	* @param args command-line arguments (unused) [web:35]
 	*/
	public static void main(String[] args) {final int VALUES = 10; // determines the size of the array

		Stats stats = new Stats(VALUES); // creates a new instance of Stats with the size VALUES

Random random = new Random();
		
		for (int i = 0; i < VALUES; i++) { // loop from 0 to the designated size of the array, adding one to i each iteration
			
stats.addValue(random.nextInt(100)); // adds one random number per loop
		}


// This next section prints a summary of the data


System.out.println("Numbers stored : ");
		System.out.println(stats);
		
System.out.println("Average = " + stats.getAverage());
		System.out.println("Count = " + stats.getCount());
	System.out.println("Total = " + stats.getTotal());
		System.out.println("Minimum value = " + stats.getB());
System.out.println("Maximum value = " + stats.getA());
	}}
