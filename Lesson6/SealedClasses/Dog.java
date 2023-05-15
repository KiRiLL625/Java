/*
Класс, который наследует sealed-класс должен быть final
или non-sealed
*/
public non-sealed class Dog extends Animal {
    public Dog(String name, int age){
        super(name, age);
    }
    @Override
    public void say(){
        System.out.println("Dog barks!");
    }
}
