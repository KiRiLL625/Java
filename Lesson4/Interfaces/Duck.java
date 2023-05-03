/*
Чтобы реализовать интерфейс, нужно написать ключевое слово
implements после имени класса или после наследуемых классов, а дальше имя интерфейса,
а также обязательно реализовать все методы, лежащие в интерфейсе.

Перед каждым реализуемым методом из интерфейса также
ставится аннотация @Override
 */
public class Duck implements Swimmable {
    @Override
    public void swim() {
        System.out.println("Duck swims");
    }

    @Override
    public int duration() {
        return 20; //возвращаем длительность плавания
    }
}
