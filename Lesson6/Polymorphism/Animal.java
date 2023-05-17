//Стандартный класс Animal
public class Animal{
    private String name;
    private int age;
    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }
    public Animal(){
        this("Boba", 3);
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
    public void play(){
        System.out.println("I'm playing");
    }
}
