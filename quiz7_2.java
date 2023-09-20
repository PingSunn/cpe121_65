import java.util.Scanner;
import java.util.Arrays;

public class quiz7_2 {
  public static void main(String[] args) {
    Scanner sn = new Scanner(System.in);
    
    System.out.println("Enter number of your order : ");
    
    int order = sn.nextInt();
    
    double[] arr = new double[10];
    System.out.print("Enter ten numbers : ");
     for (int i = 0; i < arr.length; i++) {
       arr[i] = sn.nextDouble();       
     }
     Arrays.sort(arr);
     for (int i = 0; i < arr.length; i++) {
       System.out.print(arr[i] + " ");
     }
     System.out.println("");
     double result = (arr[arr.length - order]);
     System.out.println("Your number is " + result);
     
  }
}
// 2 5 6 9 8 7 4 3 1 9
// 1.2 5.5 5.9 4.3 4.5 3.5 5.8 6.2 7.2 3.5