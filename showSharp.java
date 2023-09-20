public class showSharp {
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