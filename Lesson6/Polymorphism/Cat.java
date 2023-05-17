//класс Cat, наследующий Animal и переопределяющий метод say()
public class Cat extends Animal{
    String color;
    public Cat(String name, int age, String color){
        super(name, age);
        this.color = color;
    }
    //Переопределение say()
    @Override
    public void say(){
        System.out.println("Meow!");
    }
    @Override
    public void play(){
        System.out.println("You can't do that");
    }
}
