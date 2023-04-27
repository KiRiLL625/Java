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

public class Cat{
    private String name;
    private int age;
    private String color;
    private static int sleephours = 10;
    //breed
    public Cat(){
        this.name = "Barsik";
        this.age = 5;
        this.color = "grey";
    }
    public Cat(String name, int age, String color){
        this.name = name;
        this.age = age;
        this.color = color;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getColor(){
        return color;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setColor(String color){
        this.color = color;
    }
    public static int getSleephours(){
        return sleephours;
    }
}
