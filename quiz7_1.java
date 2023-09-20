import java.util.Scanner;

public class quiz7_1 {
  public static void main(String[] args) {
    Scanner sn = new Scanner(System.in);
    
    System.out.println("Enter the number of rows and column of the array : ");
    int size = sn.nextInt();
    
    int[][] arr = new int[size][size];
    
     for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = (int)(Math.random() * 100);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
      System.out.println("-----------------------------------");
      show49Sharp(arr);
    
  }
  
  public static void show49Sharp(int[][] matrix) {
     for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
              
              if (j % 3 == 0) {
                
                if ((matrix[i][j]  % 10 == 4) || (matrix[i][j]  % 10 == 9)) {
                  System.out.print(matrix[i][j] + " ");
                } else {
                System.out.print("# ");
                }
                
              } else {
              System.out.print(matrix[i][j] + " ");
              }
            }
            System.out.println("");
        }
  }
}
