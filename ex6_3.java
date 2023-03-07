import java.util.Scanner;

public class ex6_3 {
    public static void main(String[] args) {
            
        Scanner sn = new Scanner(System.in);

        double[] array;
        array = new double[10];
        System.out.print("Enter ten numbers : ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sn.nextDouble();
        }
        System.out.print("The index of the min is " + array_3.indexOfSmallestElement(array));
        sn.close();
    }
}
