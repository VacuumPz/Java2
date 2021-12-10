import java.util.*;

public class Les4 {
    public static void main(String[] args) {
        words20();
        PhoneNumbers.phoneNumbers();
    }

    public static void words20() {
        ArrayList<String> words20 = new ArrayList<>();
        words20.add("Создать ");
        words20.add("массив");
        words20.add("с ");
        words20.add("набором ");
        words20.add("слов");
        words20.add("слов");
        words20.add("должны ");
        words20.add("встречаться ");
        words20.add("повторяющиеся");
        words20.add("Найти ");
        words20.add("вывести ");
        words20.add("список ");
        words20.add("уникальных ");
        words20.add("слов");
        words20.add("которых ");
        words20.add("состоит ");
        words20.add("массив");
        words20.add("дубликаты ");
        words20.add("не ");
        words20.add("считаем");
        System.out.println(words20);

        Map<String, Integer> sum = new HashMap<>();
        for (String sumWords: words20) {
            int quantity = sum.getOrDefault(sumWords, 0) + 1;
            sum.put(sumWords, quantity);
        }
        System.out.println(sum);
    }
}
