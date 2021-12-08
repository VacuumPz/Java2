public class Box<M extends Fruit>{
    M[] fruits;
    public Box(M[] fruits) {
        this.fruits = fruits;
    }

    public double getWeightAll() {
        double sum = 0;
        for (M fruit : fruits) {
            sum += fruit.getWeight();
        }
        return sum;
    }
    public boolean compare(Box<?> comp) {
        return this.getWeightAll() == comp.getWeightAll();
    }

}