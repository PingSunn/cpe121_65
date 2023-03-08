public class array_5 {
    private double[] arr;

    public array_5(double[] input) { //Copy array
        arr = new double[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = input[i];
        }
        random();
    }

    private void random() { // random
        for (int i = 0; i < 5; i++) {
            int randomIndex = (int) (Math.random() * 4); // generate random index
            double temp = arr[i]; // swap elements
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;
        }
    }

    public void display() {
        for (double d : arr) { //for-each loop
            System.out.print(d + " ");
        }
        System.out.println();
    }
}