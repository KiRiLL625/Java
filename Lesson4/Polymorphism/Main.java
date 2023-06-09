import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        /*
        Допустим мы делаем такую программу:
        Пользователь с консоли вводит информацию о том, кого
        он хочет создать: кошку или собаку. И в зависимости от этого
        нам эту информацию надо сохранить в какую-то переменную, а затем
        вызвать функции say() и go(). Здесь мы и будем использовать наш
        полиморфизм.
         */
        Scanner scanner = new Scanner(System.in); //создаём объект класса Scanner
        String animal = scanner.next(); //вводим с консоли, кого мы хотим создать
        Animal pet = new Animal(); //инициализируем объект pet класса Animal
        switch(animal){ //проверка значения переменной animal
            case "Cat": //если пользователь ввёл Cat
                pet = new Cat(); //то pet мы делаем объектом класса Cat
                break;
            case "Dog": //если пользователь ввёл Dog
                pet = new Dog(); //то pet мы делаем объектом класса Dog
                break; //break ставится в конце любого case
        }
        //используем методы say() и go()
        pet.say();
        pet.go();
        /*
        И тут происходит магия: если объект будет класса Cat,
        то say() и go() выведет "Cat meows" "Cat jumps", то есть
        выведется то, что написано в переопределённых методах класса Cat.

        Если объект будет класса Dog, то say() и go() выведет "Dog barks"
        "Dog runs", то есть выведется то, что написано в переопределённых
        методах класса Dog.

        Магия заключается в том, что одни и те же функции одной и той же
        переменной ведут себя по-разному в зависимости от того, какой объект
        мы создаём с помощью ключевого слова new.

        Это был пример динамического полиморфизма: когда мы во время работы
        программы выбираем, как переменная будет себя вести
         */
        //Теперь статический полиморфизм:
        Animal pet1 = new Cat(); //тип переменной Animal, но объект класса Cat
        pet1.go(); //вывод: Cat jumps
        pet1.say(); //вывод: Cat meows
        pet1 = new Dog(); //pet1 теперь стало собакой
        pet1.go(); //вывод: Dog runs
        pet1.say(); //вывод: Dog barks
        /*
        Зачем это вообще нужно делать? Java - статически типизированный язык программирования.
        Когда у нас пользователь вводит, кого он хочет создать (кошку или собаку), то мы не
        можем предугадать этот выбор на 100%. Значит нам надо создать переменную, которая
        будет обрабатывать и то, и то другое. При этом мы не можем сделать так:

        Cat pet;
        pet = new Cat(); - всё скомпилируется, всё хорошо
        pet = new Dog; - не скомпилируется, так как тип Cat несовместим с Dog.

        Что же тогда делать? Надо создать общий класс Cat и Dog, например Animal
        и сделать так, чтобы классы Cat и Dog наследовали класс Animal. Тогда мы можем написать:

        Animal pet;
        pet = new Cat(); - всё скомпилируется, так как кошка является животным
        pet = new Dog(); - всё скомпилируется, так как собака является животным

        Вот в такой конструкции:
        Animal pet = new Cat();
        Тип переменной (в данном случае Animal) отвечает за то, какие мы методы
        можем использовать у переменной pet. А тип объекта (new Cat()) отвечает за то,
        откуда мы будем брать реализацию этих методов.

        То есть, в классе Animal есть два метода: say() и go(). Там написано, что они выводят
        "Animal says" и "Animal goes". В классе Cat есть 3 метода: say() (переопределён),
        go() (переопределён) и eat(). say() и go() здесь выводят "Cat meows" и "Cat jumps".
        Если у нас будет написано:
        Animal pet = new Cat();
        то метод eat() мы использовать не можем, так как его нет в классе Animal.
        say() и go() мы использовать можем (они есть в Animal), но выведут они
        "Cat meows" и "Cat jumps".

        Если бы класс Cat не переопределял метод say(), то его реализация была бы взята
        из класса Animal.

        В этом суть полиморфизма - один и тот же объект может "менять свою форму".
         */
    }
}
