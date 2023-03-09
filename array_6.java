public class array_6 {
    public static double [ ][ ] multiplyMatrix(double [ ][ ] a, double [ ] [ ] b) {
        double[][] c = new double[3][3];
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[0].length; j++) {
                c[i][j] = ((a[i][0] * b[0][j]) + (a[i][1] * b[1][j]) + (a[i][2] * b[2][j]));
            }
        }
        return c;
    }
}
