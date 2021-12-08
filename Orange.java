public class Orange extends Fruit {

    public Orange(int quantity, double weight) {
        super(quantity, weight);
    }

    @Override
    public double getWeight() {
        return weight*quantity*1.5;
    }
}
