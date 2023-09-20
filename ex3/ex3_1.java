import java.util.Scanner;

public class ex3_1 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int number = 0, positive = 0, negative = 0;
        double avr = 0.0, total = 0.0;
        int count = 0;
        System.out.println("Enter an integer (enter 0 to exit): ");
        do {
            number = sn.nextInt();
            if (number > 0) {
                positive += 1;
                total += number;
            } else if (number < 0) {
                negative += 1;
                total += number;
            }
            if (number != 0) {
                count += 1;
            }
            // do something with the input number
        } while (number != 0);
        if (count > 0) {
            avr = (total / count);
        }

        System.out.println("The number of positive is : " + positive);
        System.out.println("The number of negative is : " + negative);
        System.out.println("The total is : " + total);
        System.out.println("The average is : " + avr);
        
        sn.close();
    }
}
