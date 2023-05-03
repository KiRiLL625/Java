/*
Один из принципов объектно-ориентированного программирования -
наследование. Здесь у нас есть класс Animal, он содержит какие-то
переменные и методы. Класс, который будет наследовать класс Animal
"перенимает" к себе все переменные и методы, которые помечены модификаторами
public, protected или не помечены, то есть default.
Private переменные и методы не наследуются. Дальше написано в классе Dog.
 */
public class Animal {
    private String name;
    private int age;
    public Animal(){
        this.name = "Boba";
        this.age = 30;
    }
    public void say(){
        System.out.println("Animal says");
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}
