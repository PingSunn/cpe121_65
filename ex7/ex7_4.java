import java.util.Scanner;

public class ex7_4 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter your message : ");
        String str1 = sn.nextLine();

        System.out.println("The summation of number is : " + sumNumbers(str1));

    }
    public static int sumNumbers(String input) {
        int sum = 0;
        String currentNumber = "";

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            if (Character.isDigit(currentChar)) {
                currentNumber += currentChar;
            } else if (!currentNumber.isEmpty()) {
                sum += Integer.parseInt(currentNumber);
                currentNumber = "";
            }
        }

        if (!currentNumber.isEmpty()) {
            sum += Integer.parseInt(currentNumber);
        }

        return sum;
    }
}