/*
Класс Cat также наследует класс Animal и тоже переопределяет
методы say() и go()

Далее смотрите комментарии в классе Main
 */
public class Cat extends Animal {
    @Override
    public void say(){
        System.out.println("Cat meows");
    }

    @Override
    public void go() {
        System.out.println("Cat jumps");
    }

    public void eay(){
        System.out.println("I'm having a meal!");
    }

}
