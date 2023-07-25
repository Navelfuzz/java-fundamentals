/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    // Test method for roll()
    public void testRoll() {
        int n = 4;
        int[] rolls = roll(n);
        System.out.println("Rolling " + n + " times: " + Arrays.toString(rolls));
    }

    // Test method for containsDuplicates()
    public void testContainsDuplicates() {
        int[] arr = {3, 2, 1, 5};
        System.out.println("Array contains duplicates: " + containsDuplicates(arr));
    }

    // Test method for calculateAverage()
    public void testCalculateAverage() {
        int[] arr = {3, 2, 1, 5};
        System.out.println("Average of the array: " + calculateAverage(arr));
    }

    // Test method for findArrayWithLowestAverage()
    public void testFindArrayWithLowestAverage() {
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        int[] result = findArrayWithLowestAverage(weeklyMonthTemperatures);
        System.out.println("Array with lowest average: " + Arrays.toString(result));
    }

    public static void main(String[] args) {
        Library library = new Library();
        library.testRoll();
        library.testContainsDuplicates();
        library.testCalculateAverage();
        library.testFindArrayWithLowestAverage();
    }
}
