import java.util.Scanner;

public class Main {
    /* Функции - если кратко, то это блок кода с названием и аргументами
    (если они есть), нужны для сокращения кода и его лучшего понимания

    Пока что все функции начинаем писать со слов public static (на следующем
    занятии обсудим, что это значит)

    Далее идёт тип возвращаемого (сохраняемого) значения или void (если функция
    ничего не возвращает)

    Затем в скобках записываются аргументы функции.

    Тип переменных у аргументов может быть
    разный и может отличаться от типа возвращаемого значения у функции

    Если аргументов нет, то круглые скобки остаются пустыми

    И затем в фигурных скобках идёт тело функции
    */
    // Функция sum суммы двух переменных, возвращает int - результат суммирования
    // В функции main написан пример её использования
    public static int sum1(int a, int b){
        int c = a + b;
        return c;
    }
    /* Функция sum_void суммы двух переменных, ничего не возвращает, а сразу печатает
    результат в консоль
     */
    // В функции main написан пример её использования
    public static void sum_void(int a, int b){
        int c = a + b;
        System.out.println(c);
    }
    /* Пример функции без параметров и без возвращаемого значения,
    при вызове просто напечатает в консоль Hello, World!
     */
    // В функции main написан пример её использования
    public static void hello_world(){
        System.out.println("Hello, World!");
    }
    /* Функция say_hello, которая здоровается с человеком с именем name
    Если имени не равно Daniel, то она поприветствует человека и вернёт 1
    Если имя будет Daniel, то ничего не выведется и вернётся 0
     */
    // В функции main написан пример её использования
    public static int say_hello(String name){
        //строки лучше сравнивать через метод equals, эта строка аналогична name != "Daniel"
        if(!name.equals("Daniel")){
            System.out.println("Hello, " + name);
            return 1;
        }
        return 0;
    }
    /*функция, которая выводит первый элемент массива, возвращается массив а
    
    Параметр String[] strokes написан чисто для демострации, чтобы показать, что
    в качестве параметров могут быть массивы
    
     */
    public static int[] mass(String[] strokes){
        int[] a = {1, 2, 3};
        System.out.println(a[0]);
        return a;
    }
    /*
    Перегрузка функций
    
    Мы можем создать 2 функции с одинаковым названием, но при этом разными
    параметрами и их разным количеством. Также у этих функций может быть
    разное возвращаемое значение или одна из функций может возвращать значение,
    а другая нет
    
    При вызове функции компилятор смотрит на то, какие у неё параметры и в зависимости
    от этого выбирает, какую реализацию функции использовать
    
    Примеры перегруженных функций: 
    Math.min(...) для разных типов чисел
    Math.max(...) для разных типов чисел
    Math.abs(...) для разных типов чисел
    
    И да, хоть у нас и написано две функции say_hello2, но мы говорим, что
    это 1 перегруженная функция
     */
    
    // Функция say_hello2, здоровается либо с 1 человеком, либо с двумя
    public static void say_hello2(String name){
        System.out.println("Hello, " + name);
    }
    public static void say_hello2(String name1, String name2){
        System.out.println("Hello, " + name1);
        System.out.println("Hello, " + name2);
    }
    // Функция sum2 для сложения двух целых или двух дробных чисел
    public static int sum2(int a, int b){
        return a + b;
    }
    public static double sum2(double a, double b){
        return a + b;
    }
    /* Varargs - функция с переменным числом параметров
    Иногда возникает необходимость сделать неопределённое число параметров
    Это можно сделать через массив, но это не всегда удобно, так как при использовании
    функции нужно отдельно создавать массив
    Здесь такого делать не нужно, можно в функцию ниже просто при вызове закинуть
    какое-то количество чисел и всё
    
    С аргументами с неопределённым числом параметров нужно работать как с обычными
    массивами
    
    Также в функции с переменным числом параметров может быть какой-то или какие-то
    обязательные параметры, а затем будет переменное число параметров
    
    Если это так, то переменное число параметров ставят в конец блока с аргументами, например:
    public PrintStream printf(String format, Object ... args) {
        return format(format, args);
    }
    Тут главное посмотреть, что стоит в круглых скобках
     */
    
    public static int sum(int... a){ //переменное количество целых чисел а
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i]; //sum += a[i] - то же самое
        }
        return sum;
    }
    public static void main(String[] args) {
        int a = 2;
        int b = 4;
        System.out.println(sum1(a, b)); //выведет в консоль 6
        sum_void(a, b); //выведет в консоль 6
        hello_world(); //выведет в консоль "Hello, World!"
        String c = "Kolya";
        String d = "Daniel";
        say_hello(c); //выведет в консоль Hello, Kolya
        int res1 = say_hello(c); //будет содержать 1, так как эта переменная хранит возвращаемое значение
                                //также снова выведется Hello, Kolya
        say_hello(d); //ничего не выведет в консоль
        int res2 = say_hello(d); //ничего не выведется в консоль и в res2 будет лежать 0, так как имя Daniel
        say_hello2(c); //выведет в консоль Hello, Kolya
        say_hello2(c, d); //выведет в консоль Hello, Kolya
        //                                    Hello, Daniel
        System.out.println(sum2(5, 7)); //выведет в консоль 12
        System.out.println(sum2(2.3, 1.2)); //выведет в консоль 3.5
        System.out.println(sum(5, 7, 2, 7, 3, 1));
        System.out.println(sum(1, 9, 0, 4));
        System.out.println(sum(3, 1, 2)); // та самая функция с переменным числом параметров
        
        /* Оператор switch
        
        Это своего рода оператор условия, который в зависимости от значения переменной выполняет
        какой-то код
        */
        Scanner scanner = new Scanner(System.in);
        int a1 = scanner.nextInt();
        switch(a1){
            case 0: // если а1 равно 0
                System.out.println("a1 is 0"); //выведет в консоль a1 is 0
                break; /* оператор break нужен, чтобы выйти из switch, иначе компилятор
                          полезет дальше без проверки следующих case'ов */
            case 1:
                System.out.println("a1 is 1"); //выведет в консоль a1 is 1
            default:
                System.out.println("a1 is something"); /* выведет в консоль a1 is something
                                                        если a1 ни 0, ни 1
                
                Этот блок выполняется в том случае, если a1 не подходит по значениям ни
                к одному кейсу
                Блока default может вовсе не быть
                */
        }
        switch(a1){
            case 0:
            case 1: //так пишут, если для значений 0 и 1 код должен быть общим
                System.out.println("a1 is byte");
                break;
        }
        /*Enhanced switch (улучшенный switch)
        Доступен только с версии JDK 14+ !!!
         */
        
        /*
        switch(a1){
            case 0 -> System.out.println(a1); Такая запись означает, что
                                                выполнится только код справа от стрелочки.
                                                Позволяет не писать break
        }
         */
    }
}
