/*
Мы уже знаем один из способов применения ключевого слова
final - создание констант (значений, которые нельзя изменить).

Ещё один способ - сделать класс final. Такой класс нельзя будет наследовать.
Пример - класс String. Он объявлен как final.
 */
public final class Animal{
    private String name;
    private int age;
    /*
    final переменные - константы. По общепринятому правилу
    константы пишут заглавными буквами и слова разделяют
    нижним подчёркиванием. Часто final-переменные употребляются
    со словом static, так как константы в любом случае будут одинаковы
    для всех членов класса.
     */
    public static final int LEG_COUNT = 4;
    public Animal(){
        name = "Boba";
        age = 3;
    }
    public Animal(String name, int age){
        this.name = name;
        this.age = age;
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
    /*
    final-метод - метод, который нельзя переопределить
    в родительском классе. Это делается, если мы хотим, чтобы
    у всех классов-наследников метод выполнял одно и то же
     */
    public final void play(){
        System.out.println("I'm playing");
    }
}
