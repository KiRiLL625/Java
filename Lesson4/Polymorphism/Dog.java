/*
Класс Dog наследует класс Animal и переопределяет
методы say() и go()

Далее смотрите комментарии в классе Cat
 */
 class Dog extends Animal {
    @Override
    public void say(){
        System.out.println("Dog barks");
    }
    @Override
    public void go(){
        System.out.println("Dog runs");
    }
}
