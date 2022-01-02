public class Students {

    String name;
    int quantityCourses;
    String primaryCourse;

    public Students(String name, int quantityCourses, String primaryCourse) {
        this.name = name;
        this.quantityCourses = quantityCourses;
        this.primaryCourse = primaryCourse;
    }

    @Override
    public String toString() {
        return name + ". " + "Количество курсов: " + quantityCourses + " Основной курс: " + primaryCourse + "\n";
    }
}
