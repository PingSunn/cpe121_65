//import zone
import java.util.Scanner;


public class ex2_1 {

	public static void main (String[] args) {
		
		//Declare var
		double a, b, c, d, e, f, x, y;
		
		//create Obj
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a, b, c, d, e, f : ");
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		d = sc.nextDouble();
		e = sc.nextDouble();
		f = sc.nextDouble();
/* 		a = 1.0;
		d = 4.0;
		b = 2.0;
		c = 1.0; */
 		x = ((e * d) - (b * f)) / ((a * d) - (b * c));
		y = ((a * f) - (e * c)) / ((a * d) - (b * c));

		if (((a * d) - (b * c)) == 0) {
			System.out.print("The equation has no solution");
		} else {
			System.out.print("x is "+ x + " and y is " + y);

		}
	}
}
