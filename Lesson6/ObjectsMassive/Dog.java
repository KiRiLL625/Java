//Стандартный класс Dog, который наследует Animal
public class Dog extends Animal {
    public Dog(String name, int age){
        super(name, age);
    }
    @Override
    public void say(){
        System.out.println("Dog barks!");
    }
    @Override
    public String toString(){
        return "name = " + getName() +
                " age = " + getAge();
    }
}
