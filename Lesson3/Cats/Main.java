public class Main {
    public static void main(String[] args) {
        /*Cat cat_1 = new Cat();
        System.out.println(cat_1.name + " " + cat_1.age + " " + cat_1.color);
        Cat cat_2 = new Cat("Myrka", 7, "black");
        System.out.println(cat_2.name + " " + cat_2.age + " " + cat_2.color);
        Cat cat_3 = new Cat();
        System.out.println(cat_3.name + " " + cat_3.age + " " + cat_3.color);
         */
        Cat cat = new Cat();
        System.out.println(cat.getName() + " " + cat.getAge() + " " + cat.getColor());
        cat.setColor("white");
        System.out.println(cat.getName() + " " + cat.getAge() + " " + cat.getColor() + " " + Cat.getSleephours());
        Cat cat34 = new Cat("Myrka", 7, "black");
        System.out.println(Cat.getSleephours());
    }
}
