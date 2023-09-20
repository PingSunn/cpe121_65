import java.util.Scanner;

public class ex4_2 {
  public static void main(String[] args) {
    Scanner sn = new Scanner(System.in);
    
    System.out.print("Enter lenght of rope (s) : ");
    double side = sn.nextDouble();
    System.out.print("Enter quantity of rope (n) : ");
     int n = sn.nextInt();

   
    cal process = new cal();
    
    double area = process.area(n, side);
    System.out.print("Area = " + area);
  }
}

class cal {
  public static double area(int n, double side) {
    double area = (n * (side * side) / (4 * Math.tan(Math.PI/n)));
    return area;                
  }
}
