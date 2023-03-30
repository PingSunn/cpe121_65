import java.util.Scanner;

public class ex6_1 {

    public static void main(String[] args) {

        try (Scanner sn = new Scanner(System.in)) {
            System.out.print("Enter size of array : ");
            int size = sn.nextInt();

            //Create Array
            int[] intArray;
            intArray = new int[size];
            System.out.print("{ ");
            for (int i = 0; i < intArray.length; i++) {
                intArray[i] = (int) (Math.random() * 100);
                System.out.print(intArray[i] + " ");
            } // Assign value to array
            System.out.println(" }");
            array_1 arr = new array_1();
            System.out.println("Total score of array is : " +  arr.calculate(intArray));
        }
        
    }

}
