// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		// Replace this comment with your code
		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);
		double c = Double.parseDouble(args[2]);
		double d =b/100;
		double a1=a*(Math.pow(1+d,c));
		System.out.println("After " + (int) c + " years, a $"+ (int) a + " saved at " + b + "%" + " will yield $" + (int)a1);
	}
}