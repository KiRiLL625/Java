/*
Запакованные (запечатанные классы) - классы, которые позволяют
наследовать себя только некоторым классам.
Перед именем класса ставится ключевое слово sealed, после имени класса
(или после имени наследуемого класса/интерфейса) ставится ключевое
слово permits, после которого пишутся классы-наследники. Классы, которые
не включены в этот список не могут наследовать этот класс.

Каждый класс-наследник sealed-класса должен быть non-sealed или final

Доступно на очень новых версиях java.

Это просто дополнительная информация
 */
public sealed class Animal permits Cat, Dog {
    private String name;
    private int age;
    public Animal(){
        name = "Boba";
        age = 3;
    }
    public Animal(String name, int age){
        this.name = name;
        this.age = age;
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
    public void say(){
        System.out.println("Animal says");
    }
}
