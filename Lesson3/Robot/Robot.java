/*
Перечисления (enum)

enum - класс, хранящий какие-либо значения
Например, наш робот может передвигаться только влево,
вправо, вверх и вниз. Если бы не было перечислений, были
бы некоторые трудности, чтобы указать, какие именно должны
быть направления движения

Внутри перечисления также можно писать функции и конструкторы,
единственное отличие от классов - нельзя наследоваться (об этом позже)
 */
enum Direction{
    DOWN,
    LEFT,
    UP,
    RIGHT
}
/*
Также можно написать:
enum Direction1{
    DOWN ("Вниз"),
    LEFT ("Влево"),
    UP ("Вверх"),
    RIGHT ("Вправо"),
}
*/

/*
Специфические функции перечислений:
values() - возвращает массив из всех значений в enum
ordinal() - возвращает порядковый номер константы,
отсчёт идёт с нуля
valueOf("NAME") - возвращает объект enum по переданному имени
Пример:
System.out.println(Direction1.valueOf("DOWN");
Выведет: Вниз
*/
/*
Перечисления очень удобно использовать в сочетании с switch
 */
public class Robot {
    private int x; //координата х
    private int y; //координата y
    private Direction direct; //переменная, отвечающая за направление
    public Robot(){
        this.x = 0;
        this.y = 0;
        this.direct = Direction.UP;
    } //устанавливаем координаты роботу (0,0) и направление вверх при
      //создании объекта (по умолчанию)
    public int getX(){ //получаем координату х
        return x;
    }
    public int getY(){ //получаем координату y
        return y;
    }
    public Direction getDirection(){ //получаем направление движения
        return direct;
    }
    public void setX(int x){ //устанавливаем координату х
        this.x = x;
    }
    public void setY(int y){ //устанавливаем координату y
        this.y = y;
    }
    public void setDirection(Direction direct){ //устанавливаем направление
        this.direct = direct;
    }
}
