//стандартный класс Cat, который наследует Animal
public class Cat extends Animal{
    String color;
    public Cat(String name, int age, String color){
        super(name, age);
        this.color = color;
    }
    @Override
    public void say(){
        super.say();
        System.out.println("Meow!");
    }
    @Override
    public void play(){
        System.out.println("You can't do that");
    }
    @Override
    public String toString(){
        return "name = " + getName() +
                " age = " + getAge() +
                " color = " + color;
    }
}
