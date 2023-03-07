import java.util.Scanner;

public class ex6_5 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        double[] array;
        array = new double[5];

        for (int i = 0; i < array.length; i++) {
            array[i] = sn.nextDouble();
        }

        sn.close();
    }
}
