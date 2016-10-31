import java.util.Scanner;

public class zad6 {

	public static void main(String[] args) {
		Scanner f = new Scanner(System.in);
        int a = f.nextInt();
        int b = f.nextInt();
        int x = f.nextInt();
        int y = f.nextInt();     
        
        if (Math.abs(a-x)<=1 && Math.abs(b-y)<=1) { 
        	System.out.println("YES");
        }
        else System.out.println("NO");
	}

}
