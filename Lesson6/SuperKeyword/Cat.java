public class Cat extends Animal{
    String color;
    public Cat(String name, int age, String color){
        /*
        Ключевое слово super означает, что мы что-то берём из родительского класса.
        super(parameters) - вызов конструктора родительского класса.
        Ниже мы вызываем конструктор класса Animal.
        Это позволяет избежать дублирования кода.

        !!!ВАЖНО!!!
        Вызов конструктора через super() должен быть всегда первой строкой
        в конструкторе, иначе программа не скомпилируется.
         */
        super(name, age);
        this.color = color;
    }
    @Override
    public void say(){
        /*
        super.methodName - вызов метода из родительского класса.
        В классе Animal say() выводит "Animal says". Здесь мы вызываем
        этот метод и ещё добавляем вывод "Meow!". Поэтому при создании объекта
        класса Cat метод say() выведет:
        Animal says
        Meow!

        И да, точно также вызов метода суперкласса (родительского класса) должен
        быть первой строкой в методе.
         */
        super.say();
        System.out.println("Meow!");
    }
    @Override
    public void play(){
        System.out.println("You can't do that");
    }
}
