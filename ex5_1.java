public class ex5_1 {
    static class Circle {
        public static double CirclePi = 3.14;
        private double r;
        public Circle(double radius) {
            this.r = radius;
        }
        public double getArea(){ //πr2
            return (Math.PI * Math.pow(r, 2));
        }
        public double getVolume(){ //4/3 πr3
            return (4/3 * Math.PI * Math.pow(r, 3));
        }
        public double getCircumference(){ //2πr
            return (2 * Math.PI * r);
        } 
    }
    public static void main(String[] args) {
        Circle c1 = new Circle(2.24);
        Circle c2 = new Circle(4.14);
        
        System.out.println("First Circle (C1)");
        System.out.println("-----------------");
        System.out.println("Circle's area = " + c1.getArea());
        System.out.println("Circle's Volume = " + c1.getVolume());
        System.out.println("Circle's Circumference = " + c1.getCircumference());
        
        System.out.println("\nSecond Circle (C2)");
        System.out.println("-----------------");
        System.out.println("Circle's area = " + c2.getArea());
        System.out.println("Circle's Volume = " + c2.getVolume());
        System.out.println("Circle's Circumference = " + c2.getCircumference());
    }
}