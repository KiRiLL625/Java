/*
Дженерик-классы. Если мы знаем, что наш класс работает только
с одним каким-то типоv (или несколькими конкретными типами), то
мы можем указать в угловых скобках после названия класса какой-то
неопределённый тип. Обычно пишут буквы T, E, U, Q, P, V, но вообще
там может быть что угодно.
 */
public class Box<T> {
    T things; //создаём переменную типа T
    public T getThings(){ //получаем данные, возвращая тип T (далее в классе Main)
        return things;
    }
}
