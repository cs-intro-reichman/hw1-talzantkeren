// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		
		// To get you started, here is the first line in the program:
		int N = Integer.parseInt(args[3]);
		 String name1 = args[0];
		String name2 = args[1];
		String name3 = args[2];
		double i = (double)N/3; 
		i= Math.ceil(i);
		System.out.println("Dear "+ name3 +", "+ name2 + ", and " + name1 + ": pay " + i +" Shekels each.");
	}
}
