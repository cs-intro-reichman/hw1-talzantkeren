// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    // Replace this comment with your code
		int n = Integer.parseInt(args[0]);
		int h = n/100;
		int t = n%100/10;
		int o = n%10;
		System.out.println(h + " hundreds, " + t + " tens, and " + o + " ones.");

	}
}
