/* Create a method that will receive an integer parameter and then return an ArrayList that 
 * contains all of the number’s factors, excluding 1 and itself.  

Create a 2nd method that will remove all numbers from its ArrayList parameter that are not 
composite numbers.  Composite numbers are divisible by 1, itself, and must have at least 1 other 
positive factor.  You will need to use % to determine if a number is a factor.  While you will 
want to create a main method for testing, you only need to hand in the completed methods of the 
class as shown below.
*/
package arraylistPractice;

import java.util.ArrayList;

public class miniLab {

	public static ArrayList<Integer> getListOfFactors(int number) {
		ArrayList<Integer> factors = new ArrayList<Integer>();
		for (int j = 2; j < number; j++) {
			if (number % j == 0) {
				factors.add(j);
			}
		}
		return factors;
	}

	public static void keepOnlyCompositeNumbers(ArrayList<Integer> nums) {
		for (int i = 0; i<nums.size(); i++) {
			if (getListOfFactors(nums.get(i)).size()<=0)
				nums.remove(i);
			i--;
		}
	}

	public static void main(String args[]) {
		ArrayList<Integer> composite = new ArrayList<Integer>();
		composite.add(2);
		composite.add(3);
		composite.add(6);
		composite.add(127);
		composite.add(254);
		composite.add(381);
		
		System.out.println(getListOfFactors(9));
		System.out.println(getListOfFactors(23));
		System.out.println(getListOfFactors(762));
		keepOnlyCompositeNumbers(composite);
	}
}
