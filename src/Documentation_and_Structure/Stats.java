package Documentation_and_Structure;

import java.util.Arrays;

/**
 * Stats stores a fixed-size array of integers and provides basic statistics
 * such as total, average, minimum, and maximum over the stored values. [web:35]
 */
public class Stats {

    /** Backing array holding the values; fixed capacity set by constructor. */
    int[] numbers; // Also aliased as values for clearer naming below. [web:37]

    /** Current insertion index; also represents how many values have been added. */
    int count; // Tracks how many values have been inserted so far. [web:37]

    // Clearer alias field for readability without removing original 'numbers'.
    /** Alias of numbers for clearer naming in comments and future code. */
    @SuppressWarnings("unused")
    private int[] valuesAliasForClarity; // Mirrors numbers; set in constructor. [web:37]

    /**
     * Adds a single value to the next position in the array. Assumes capacity
     * is not exceeded by the caller. [web:38]
     *
     * @param value the integer to add into the stats array [web:35]
     */
    public void addValue(int value) {
        numbers[count] = value; // Place value at current index. [web:38]
        count++; // Advance insertion index. [web:38]
    }

    /**
     * Returns the logical size used for statistics calculations. This
     * implementation returns the array length (capacity), not the insertion count. [web:37]
     *
     * @return the number of elements considered (array length) [web:35]
     */
    public int getCount() {
        return numbers.length; // Note: capacity, not 'count' field. [web:37]
    }

    /**
     * Returns the maximum value in the array. Name kept for compatibility. [web:37]
     *
     * @return maximum stored value [web:35]
     */
    public int getA() {
        int max = numbers[0]; // Start with first element as current max. [web:38]
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) max = numbers[i]; // Update max when a larger value is found. [web:38]
        }
        return max; // Final maximum. [web:38]
    }

    /**
     * Returns the minimum value in the array. Name kept for compatibility. [web:37]
     *
     * @return minimum stored value [web:35]
     */
    public int getB() {
        int min = numbers[0]; // Start with first element as current min. [web:38]
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) min = numbers[i]; // Update min when a smaller value is found. [web:38]
        }
        return min; // Final minimum. [web:38]
    }

    /**
     * Computes the total sum of all elements in the array. [web:37]
     *
     * @return sum of all values [web:35]
     */
    public int getTotal() {
        int total = 0; // Accumulator for the sum. [web:38]
        // Total all values within the array.
        for (int i = 0; i < numbers.length; i++) {
            total += numbers[i]; // Add current element into the running total. [web:38]
        }
        return total; // Sum of all elements. [web:38]
    }

    /**
     * Computes the arithmetic mean of all elements in the array as a double. [web:37]
     *
     * @return average value across all elements [web:35]
     */
    public double getAverage() {
        return getTotal() / (double) numbers.length; // Use double division to avoid truncation. [web:37]
    }

    /**
     * Returns the average as well; legacy method name retained. [web:37]
     *
     * @return average value across all elements [web:35]
     */
    public double get() {
        int x = 0; // Accumulator for sum. [web:38]
        for (int i = 0; i < numbers.length; i++) {
            x += numbers[i]; // Sum values. [web:38]
        }
        double y = x / (double) numbers.length; // Compute mean using double division. [web:37]
        return y; // Average. [web:37]
    }

    /**
     * Returns a string representation of the stored numbers, as an array literal. [web:37]
     *
     * @return string form of all values [web:35]
     */
    @Override
    public String toString() {
        return Arrays.toString(numbers); // Delegate to Arrays utility for display. [web:37]
    }

    /**
     * Constructs a Stats with a fixed capacity and initializes storage. [web:37]
     *
     * @param capacity how many integers the stats will hold [web:35]
     */
    public Stats(int capacity) {
        numbers = new int[capacity]; // Allocate backing array. [web:38]
        valuesAliasForClarity = numbers; // Keep alias pointing to the same array. [web:37]
    }

    // --------------------------
    // Clearer-named convenience accessors (added for readability without breaking existing API)
    // --------------------------

    /**
     * Clearer alias for getA(): returns the maximum value. [web:37]
     *
     * @return maximum stored value [web:35]
     */
    public int getMax() {
        return getA(); // Delegate to existing implementation. [web:37]
    }

    /**
     * Clearer alias for getB(): returns the minimum value. [web:37]
     *
     * @return minimum stored value [web:35]
     */
    public int getMin() {
        return getB(); // Delegate to existing implementation. [web:37]
    }

    /**
     * Clearer alias for numbers length to indicate capacity-based counting. [web:37]
     *
     * @return number of elements considered (array length) [web:35]
     */
    public int getElementCount() {
        return getCount(); // Mirrors the existing behavior. [web:37]
    }

    /**
     * Returns how many values have been inserted so far (the insertion index). [web:37]
     *
     * @return number of inserted values (may be less than capacity) [web:35]
     */
    public int getInsertedCount() {
        return count; // Provides clarity separate from capacity-based getCount(). [web:37]
    }
}
