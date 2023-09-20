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

        int i,j,k,z;
        System.out.println("The multiplication of the matrices is ");
        for(i=0; i<3; i++){
            for(j=0; j<3; j++){
            System.out.print(array1[i][j]+" ");
            }
            if(i==0 || i==2) {
                System.out.print("  "); 
            }
            if(i==1) {
                System.out.print("* "); 
            }
            for(k=0; k<3; k++){
                System.out.print(array2[i][k]+" ");
            }
            if(i==1) {
                System.out.print("=");
            }
            if(i==0 || i==2) {
                System.out.print(" "); 
            }
            for(z=0; z<3; z++){
                System.out.printf(" %1.2f",result[i][z]);
                }
            System.out.print("\n");
        }
    }
    public static double [ ][ ] show57star(double [ ][ ] a, double [ ] [ ] b) {
        double[][] c = new double[3][3];
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[0].length; j++) {
                c[i][j] = ((a[i][0] * b[0][j]) + (a[i][1] * b[1][j]) + (a[i][2] * b[2][j]));
            }
        }
        return c;
    }
    array_6 arr = new array_6();
    arr.multiplyMatrix();

    double result = multiplyMatrix(arr, arr2);
    System.out.print("Result : " + show57star());
}
