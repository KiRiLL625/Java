public class Dog extends Animal {
    //Обязательно определяем абстрактный метод родительского класса
    @Override
    public void go() {
        System.out.println("Dog runs");
    }
}
