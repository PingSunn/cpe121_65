import java.util.Scanner;

public class ex6_6 {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        double[][] array1;
        double[][] array2;

        array1 = new double[3][3];
        array2 = new double[3][3];

        System.out.print("Enter matrix 1 : ");
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[0].length; j++) {
                array1[i][j] = sn.nextDouble();
            }
        }
        System.out.print("Enter matrix 2 : ");
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[0].length; j++) {
                array2[i][j] = sn.nextDouble();
            }
        }

        // System.out.print(array_6.multiplyMatrix(array1, array2));
        double[][] result = array_6.multiplyMatrix(array1, array2);

        // System.out.println("Result:");
        // for (int i = 0; i < array1.length; i++) {
        //     for (int j = 0; j < array1[0].length; j++) {
        //         System.out.print(array1[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        // System.out.println("Result:");
        // for (int i = 0; i < array2.length; i++) {
        //     for (int j = 0; j < array2[0].length; j++) {
        //         System.out.print(array2[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        // System.out.println("Result:");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                // System.out.print(array1[i][j] + " " + array1[i+1][j] + " " + array1[i+1][j] + " "+ result[i][j]+ " "+ result[i+1][j]+ " "+ result[i][j]);
            }
            System.out.println();
        }
    }
}