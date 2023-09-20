public class ex8_4 {
    public static void main(String[] args) {
        Pork a = new Pork();
        Pineapple b = new Pineapple();
        a.eat();
        b.eat();
    }
}

interface Eatable {
    public void eat();
}

class Pork implements Eatable {
    public void eat() {
        System.out.println("I am yummy. Cook me well!");
    }
}
class Pineapple implements Eatable {
    public void eat() {
        System.out.println("I am yummy. Eat me fresh.");
    }
}