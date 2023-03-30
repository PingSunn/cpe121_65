import java.util.Scanner;

public class ex6_2 {

    public static void main(String[] args) {

        try (Scanner sn = new Scanner(System.in)) {
            System.out.print("Enter size of array : ");
            int size = sn.nextInt();

            //Create Array
            int[] intArr;
            int[] usrArr;
            intArr = new int[size];
            usrArr = new int[4];

            for (int i = 0; i < usrArr.length; i++) {
                System.out.print("Your number " + (i+1) + " is : ");
                usrArr[i] = sn.nextInt();
            }

            System.out.print("{ ");
            for (int i = 0; i < intArr.length; i++) {
                intArr[i] = (int) (Math.random() * 10);
                System.out.print(intArr[i] + " ");
            } // Assign value to array
            System.out.println(" }");
            array_2 arr = new array_2();
            // System.out.println("Total score of array is : " +  arr.calculate(intArray));
            System.out.println("MaxFrequency =  " + arr.freq(usrArr, intArr));
        }
        
    }

}
