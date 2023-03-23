import java.util.Scanner;

public class ex7_1 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter your message : ");
        String str1 = sn.nextLine();
        System.out.println("Your message is " + check(str1));
    }

    public static boolean check(String s) {
        if (s.indexOf(('e')) == 1) {
            return true;
        } else {
            return false;
        }

    }
}
