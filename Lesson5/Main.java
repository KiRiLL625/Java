public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Myrka", 3); //создаём первую кошку
        Cat cat2 = new Cat("Myrka", 3); //создаём вторую кошку
        System.out.println(cat1); //вывод: Cat@76fb509a, если метод toString() не переопределён
        System.out.println(cat1); /*вывод: Myrka 3, если метод toString() переопределён.
                                    Заметьте, что мы даже не вызываем этот метод - он автоматически
                                    вызывается.
        */
        System.out.println(cat1 == cat2); //вывод: false (это не один и тот же объект)
        Cat cat3 = cat2;
        System.out.println(cat2 == cat3); //вывод: true (это один и тот же объект)
        System.out.println(cat1.equals(cat2)); //вывод: false, если метод equals() не переопределён
        System.out.println(cat1.equals(cat2)); //вывод: true, если метод equals() переопределён
    }
}
