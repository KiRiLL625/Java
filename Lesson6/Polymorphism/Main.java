public class Main {
    public static void main(String[] args) {

        Animal animal1 = new Animal();
        doAnimalThing(animal1); //для Animal вывод: Animal says
        Cat cat1 = new Cat("Tom", 3, "white");
        doAnimalThing(cat1); //для Cat вывод: Meow!
        Dog dog1 = new Dog("Лайка", 5);
        doAnimalThing(dog1); //для собаки вывод: Dog barks!
        Animal dog2 = new Dog("Richard", 4);
        doAnimalThing(dog2); //даже есть тип Animal (слева от равно),
//                             а объект Dog (справа от равно), то вывод всё равно
//                             будет: Dog barks!
        /*
        Напомню, что тип переменной (тот тип, который стоит перед названием переменной
        слева от знака равно) отвечает только за то, какие методы мы можем использовать.
        При этом реализация этих методов берётся из тех классов, которые переопределяют
        этот метод.
         */

    }
    /*Метод, который принимает в качестве параметра объект типа
    Animal и просто вызывает у этого объекта метод say()

    Плюс полиморфизма заключается в том, что в качестве параметра мы
    можем передать не только объект класса Animal, но и объекты того типа,
    которые являются наследниками Animal (в нашем случае Cat и Dog) и метод
    будет работать по-разному.
     */
    public static void doAnimalThing(Animal animal){
        animal.say();
    }
}
