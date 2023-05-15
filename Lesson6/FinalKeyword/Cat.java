public class Cat extends Animal{ //ошибка: Animal объявлен final
    String color;
    public Cat(String name, int age, String color){
        super(name, age);
        this.color = color;
    }
    @Override
    public void say(){
        System.out.println("Meow!");
    }
    /*
    Если бы класс Animal не был final, то ниже всё равно была
    бы ошибка, так как мы не можем переопределить final-метод
    из класса Animal.
     */
    @Override
    public void play(){
        System.out.println("You can't do that");
    }
}
