import java.util.Scanner;

public class ex4_1 {
  public static void main(String[] args) {
    Scanner sn = new Scanner(System.in);
    
    System.out.print("Enter 3 numbers : ");
    int num1 = sn.nextInt();
    int num2 = sn.nextInt();
    int num3 = sn.nextInt();
    
    check process = new check();
    
    boolean result = process.status(num1, num2, num3);
    System.out.println(result);
  }
}

class check {
  public boolean status(int a, int b, int c) {
    if ((a > b && a > c) || (c < a && c < b)) {
      return true;
    }  
    return false;
  }
}
