import java.util.Scanner;

public class zad8 {
	public static void main(String[] args) {
		Scanner f = new Scanner(System.in);
		int a = f.nextInt();
	    int b = f.nextInt();
		int c = f.nextInt();
		
		if (c*c>a*a + b*b) {
			System.out.println("Tupougolniy");
		}
		else if (c*c<a*a + b*b) {
			System.out.println();
		}

}
