import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Vasya", 3523); //объект записи
        System.out.println(student1.name()); //выводим имя
        System.out.println(student1.id()); //выводим id
        System.out.println(student1); //вывод: Student[name=Vasya, id=3523]
    }
}
