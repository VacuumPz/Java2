import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Students student1 = new Students("Евгений", 6, "Физика");
        Students student2 = new Students("Борис", 4, "Математика");
        Students student3 = new Students("Леша", 5, "Физика");
        Students student4 = new Students("Яков", 3, "Литература");
        Students student5 = new Students("Анна", 7, "История");
        Students student6 = new Students("Нина", 5, "История");
        Students student7 = new Students("Антон", 9, "Математика");
        Students student8 = new Students("Лена", 3, "Физика");
        Students student9 = new Students("Вера", 8, "Литература");

        ArrayList<Students> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);
        students.add(student7);
        students.add(student8);
        students.add(student9);

        List<String> result1 = students.stream()
                .map((student) -> student.primaryCourse)
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Список курсов:");
        System.out.println(result1 + "\n");

        List<Students> result2 = students.stream()
                .sorted((s2, s1) -> (s1.quantityCourses - s2.quantityCourses))
                .limit(3)
                .collect(Collectors.toList());

        System.out.println("Больше всего курсов у:");
        System.out.println(result2 + "\n");

        String searchCourse = "Литература";
        List<String> result3 = students.stream()
                .filter(student -> student.primaryCourse.equals(searchCourse))
                .map((student) -> student.name)
                .collect(Collectors.toList());

        System.out.println("Студенты, посещающие курс " + searchCourse + ":");
        System.out.println(result3);

    }
}
