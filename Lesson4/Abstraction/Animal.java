/*
Абстрактный класс - класс, который содержит какую-то
базовую логику и нужен лишь для того, чтобы другие классы
наследовали его и дополняли его.

Отличие от обычного класса - объект такого класса нельзя создать
(то есть писать new Animal() в данном случае нельзя), однако
он может использоваться как тип переменной

Абстрактный класс помечен ключевым словом abstract перед словом class
 */
public abstract class Animal {
    public void say(){
        System.out.println("Animal says");
    }
    public abstract void go();
    /*
    Абстрактный метод - метод, не имеющий тела, его
    реализация должна быть написана в дочерних классах. Также
    помечен ключевым словом abstract. Любой класс, который имеет
    хотя бы 1 абстрактный метод, должен быть также абстрактным.
     */
}
