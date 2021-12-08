import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Les3 {
    public static void main(String[] args) {
        boxes();
        swap();

    }

    public static void boxes() {
        //
        Apple apple1 = new Apple(3, 0.7);
        Apple apple2 = new Apple(4, 0.6);
        Apple[] apples = new Apple[]{apple1, apple2};
        Box<Apple> appleBox = new Box<>(apples);
        System.out.println(appleBox.getWeightAll());

        Orange orange1 = new Orange(2, 1.1);
        Orange orange2 = new Orange(5, 1.2);
        Orange[] oranges = new Orange[]{orange1, orange2};
        Box<Orange> orangeBox = new Box<>(oranges);
        System.out.println(orangeBox.getWeightAll());

        System.out.println(appleBox.compare(orangeBox));


        //Добавление яблок в коробку (пересыпание из коробки в коробку?)
        Apple apple3 = new Apple(5, 0.65);
        Apple[] apples2 = new Apple[apples.length+1];
        int i=0;
        for ( Apple apples3 : apples)
        {
            apples2[i]=apples3; i++;
        }
        apples2[i++]=apple3;
        Box<Apple> appleBox2 = new Box<>(apples2);
        System.out.println(appleBox2.getWeightAll());

    }


    public static void swap() {
        List fruits = new ArrayList();
        fruits.add("Apple");
        fruits.add("Orange");
        System.out.println(fruits);
        Collections.swap(fruits, 0, 1);
        System.out.println(fruits + " Меняем местами два элемента массива");
    }
}
