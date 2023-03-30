public class ex5_2 {
    public static class Triangle {
        private double s1;
        private double s2;
        private double s3;
        
        public Triangle() {
            this.s1 = 0.0;
            this.s2 = 0.0;
            this.s3 = 0.0;
        }

        public Triangle(double s1, double s2, double s3) {
            this.s1 = s1;
            this.s2 = s2;
            this.s3 = s3;
        }
    
        public double getS1() {
            return s1;
        }
    
        public double getS2() {
            return s2;
        }
    
        public double getS3() {
            return s3;
        }
    
        public double getArea() {
            double s = (s1 + s2 + s3) / 2;
            return Math.sqrt(s * (s - s1) * (s - s2) * (s - s3));
        }
    
        public double getPerimeter() {
            return s1 + s2 + s3;
        }
    }
    
    public static void main(String[] args) {
        Triangle t1 = new Triangle(3.0, 4.0, 5.0);
        System.out.println("First Triangle (T1)");
        System.out.println("Triangle's area = " + t1.getArea());
        System.out.println("Triangle's Perimeter = " + t1.getPerimeter());

        Triangle t2 = new Triangle(12, 13, 14);
        System.out.println("Second Triangle (T2)");
        System.out.println("Triangle's area = " + t2.getArea());
        System.out.println("Triangle's Perimeter = " + t2.getPerimeter());
    }
}