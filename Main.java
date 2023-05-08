
public class Main {

	public static double findRatio(int[] nums) {
	    int smallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;
	    int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;

	    // Find the two smallest and two largest elements in the array
	    for (int num : nums) {
	        if (num < smallest) {
	            secondSmallest = smallest;
	            smallest = num;
	        } else if (num < secondSmallest) {
	            secondSmallest = num;
	        }

	        if (num > largest) {
	            secondLargest = largest;
	            largest = num;
	        } else if (num > secondLargest) {
	            secondLargest = num;
	        }
	    }

	    // Calculate the ratio of the sum of the largest two numbers divided by the sum of the smallest two numbers
	    double numerator = (double) (largest + secondLargest);
	    double denominator = (double) (smallest + secondSmallest);
	    return numerator / denominator;
	}

	public static void main(String[] args) {
	    int[] nums = { 3, 5, 12, 450, 1, 1, 5, 6, 23, 6, 8, 9, 321, 2, 3 };
	    double ratio = findRatio(nums);
	    System.out.println("Ratio: " + ratio);
	}
}