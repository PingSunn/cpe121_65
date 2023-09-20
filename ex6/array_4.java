public class array_4 {
    public static int average(int[] array) {
        int sumInt = 0;
        int avg = 0;
        for (int i = 0; i < array.length; i++) {
            sumInt += array[i];
        }
        avg = (sumInt / array.length);
        return avg;
    }
    public static double average(double[] array){
        double sumDouble = 0;
        double avg = 0;
        for (int i = 0; i < array.length; i++) {
            sumDouble += array[i];
        }
        avg = (sumDouble / array.length);
        return avg;

    }
}