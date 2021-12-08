public class Apple extends Fruit {

    public Apple(int quantity, double weight) {
        super(quantity, weight);
    }

    @Override
    public double getWeight() {
        return weight*quantity;
    }
}
