/*
Теперь про полиморфизм. Полиморфизм означает, что
наш объект может принимать много "форм". Сейчас поймём, что это
значит.

Допустим, у нас есть класс Animal, а в нём написаны два простых
метода - say() и go()

Эти функции переопределены в классах Dog, Cat.

Далее смотрите комментарии в классе Dog.
 */
public class Animal {
    public void say(){
        System.out.println("Animal says");
    }
    public void go(){
        System.out.println("Animal goes");
    }
}
