public abstract class Fruit {
    int quantity;
    double weight;

    public Fruit(int quantity, double weight) {
        this.quantity = quantity;
        this.weight = weight;
    }

    public abstract double getWeight();

}
