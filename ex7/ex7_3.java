import java.util.Scanner;

public class ex7_3 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        System.out.println("Enter Your Message : ");
        String text = sn.nextLine();

        System.out.print(toUpcase(text));

    }
    public static String toUpcase(String text) {
       String temp = text.substring(text.length() - 3); //เอาแค่ 3 ตัวท้าย
       String tempUpper = temp.toUpperCase();
       String result = text.replace(temp, tempUpper);
       return result;
    }
    
}
