/*
Класс, который наследует абстрактный класс, должен определять
все его абстрактные методы или он сам также должен быть абстрактным
 */
public class Cat extends Animal {
    @Override
    public void go() {
        System.out.println("Cat jumps");
    }
}
