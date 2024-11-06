// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int a = (int)(Math.random()*n);
		int b = (int)(Math.random()*n);
		int c = (int)(Math.random()*n);
		int n1 = Math.min(a,Math.min(b,c));
		int n2 = Math.max(a,Math.max(b,c));
		int n3=a+b+c-n1-n2;
		
		System.out.println(a + " " + b + " " + c);
		System.out.println(n2 + " " + n3 + " " + n1);
	}   
}
