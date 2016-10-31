package zad7;

import java.util.Scanner;

public class zad7 {

	public static void main(String[] args) {
		Scanner f = new Scanner(System.in);
		System.out.println("Vvedi a");
		double a = f.nextDouble();
		System.out.println("Vvedi b");
		double b = f.nextDouble();
		System.out.println("Vvedi c");
		double c = f.nextDouble();
		double x1 = 0,x2 = 0;
		double D;	
		D = b*b - 4*a*c;
		if (D>0) {
			x1 = (-b - Math.sqrt(D))/(2*a);
			x2 = (-b + Math.sqrt(D))/(2*a);
		}
		else if (D==0){
			x1 = -b/(2*a); x2 = -b/(2*a);
		}
		else if (D<0){
			System.out.println("Deystvitelnih korney net");
		}
		System.out.println(x1+" "+ x2);

	}

}
