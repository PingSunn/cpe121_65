//package ex8;

public class ex8_1 {
    public static void main(String[] args) {
        Fish fish = new Fish(0.3);
        System.out.print(fish); 
        fish.swim();
        Fish shark = new Shark(200);
        System.out.print(shark);
        shark.swim();
        Fish mFish = new MechanicalFish(1.2);
        System.out.print(mFish);
        mFish.swim();
        Fish sdFish = new SaltedDriedFish(2.5);
        System.out.print(sdFish);
        sdFish.swim();
    }
    
    public static class Fish {
        private double weight;
        
        public Fish(double weight) {
            this.weight = weight;
        }
        
        public void swim() {
            System.out.print(" All fish swim.\n");
        }
        
        public double getWeight() {
            return this.weight;
        }
        
        public String toString() {
            return "I am a " + getWeight() + " kg fish.";
        }
    }
    
    public static class Shark extends Fish {
        public Shark(double weight) {
            super(weight);
        }
        
        public String toString() {
            return "I am a " + getWeight() + " kg shark.";
        }
    }
    
    public static class MechanicalFish extends Fish {
        public MechanicalFish(double weight) {
            super(weight);
        }
        
        public void swim() {
            System.out.print(" I float in water.\n");
        }
        
        public String toString() {
            return "I am a " + getWeight() + " kg mechanical fish.";
        }
    }
    
    public static class SaltedDriedFish extends Fish {
        public SaltedDriedFish(double weight) {
            super(weight);
        }
        
        public void swim() {
            System.out.print(" I am dead and I no longer swim.\n");
        }
        
        public String toString() {
            return "I am a " + getWeight() + " kg salted dried fish.";
        }
    }
}
