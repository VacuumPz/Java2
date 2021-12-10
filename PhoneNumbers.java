import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneNumbers {
    public static void phoneNumbers() {
        LinkedHashMap<Integer, String> phoneBook = new LinkedHashMap<>();
        phoneBook.put(456456111, "Name1");
        phoneBook.put(456217825, "Name2");
        phoneBook.put(456245322, "Name2");
        phoneBook.put(456789213, "Name3");
        phoneBook.put(235879213, "Name4");
        phoneBook.put(123452136, "Name5");
        phoneBook.put(456456212, "Name5");
        phoneBook.put(456822149, "Name6");
        //предварительный вывод
/*        for (Map.Entry<Integer, String> printBook : phoneBook.entrySet()) {
            System.out.println(printBook.getValue() + ": " + printBook.getKey());
        }*/

        //Запись в справочник
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя:");
        String name = sc.next();
        System.out.println("Введите телефон:");
        int phone = sc.nextInt();

        phoneBook.put(phone, name);

        for (Map.Entry<Integer, String> printBook : phoneBook.entrySet()) {
            System.out.println(printBook.getValue() + ": " + printBook.getKey());
        }

        //Поиск в справочнике
        System.out.println("Поиск по имени:");
        String nameToFind = sc.next();

        for (Map.Entry<Integer, String> printBook : phoneBook.entrySet()) {
            if (printBook.getValue().equals(nameToFind)) {
                System.out.println(printBook.getValue() + ": " + printBook.getKey());
            }
        }
    }
}
