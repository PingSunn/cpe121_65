import java.util.Scanner;

public class ex7_2 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter Your Message : ");
        String text = sn.nextLine();
        if (text.length() < 2) {
            System.out.print("Error");
        } else {
            System.out.print(slip2Position(text));
        }
        

    }
    public static String slip2Position(String text) {
        String tempText = text.substring(0, 2);
        text = text.substring(2);
        return text + tempText;
    }
    
}
