/*
Класс, который наследует sealed-класс должен быть final
или non-sealed
 */
public non-sealed class Cat extends Animal{
    String color; //ввели специальную переменную для кота, не сделал её private просто для демонстрации
    public Cat(String name, int age, String color){
        super(name, age);
        this.color = color;
    }
    @Override
    public void say(){
        System.out.println("Meow!");
    }
}
