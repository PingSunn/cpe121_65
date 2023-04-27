public class ex8_2 {
    public static void main(String[] args) {
        Flower cauly = new CauliFlower("Boil before stir fry. Cook me well.", 30);
        Flower soapFlower = new CarvedFlower("For room decoration.", "Soap", 4);
        Flower carrie = new WallFlower();
        System.out.println(cauly); 
        System.out.println(soapFlower); 
        System.out.println(carrie);
    }
}
class Flower {

    private String useInstruction;

    public Flower(String instruction) {
        this.useInstruction = instruction;
    } 
    public String getInstruction(){
        return this.useInstruction;
    }
}

class WallFlower extends Flower{
    public WallFlower() {
        super("Talk to me for some interesting information.");
    }
    public String toString(){
        return "Wallflower: " + super.getInstruction();
    }
}

class CauliFlower extends Flower{
    private double price;
    public CauliFlower(String instruction, double perKgPrice) {
        super(instruction);
        this.price = perKgPrice;
    }
    public String toString(){
        return "Cauliflower : Price " + this.price + " baht/kg" + super.getInstruction();
    }
}

class CarvedFlower extends Flower{
    private double price;
    private String material;
    public CarvedFlower(String instruction, String material, double perUnitPrice){
        super(instruction);
        this.material = material;
        this.price = perUnitPrice;
    }
    public String toString() {
        return "Carved flower: Price" + price + "$US. Material = "+ material + super.getInstruction();
    }
}

