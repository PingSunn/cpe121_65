import java.util.Scanner;

public class ex6_5 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        double[] array;
        array = new double[5];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Read a number : ");
            array[i] = sn.nextDouble();
        }
        array_5 arr = new array_5(array);
        
        arr.display();
        sn.close();
    }
}
