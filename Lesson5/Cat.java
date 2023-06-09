public class Cat extends Pet {
    public Cat(String name, int age) {
        super(name, age); //super(parameters) вызывает конструктор суперкласса
//                          (родительского класса, в данном случае Pet)
    }
    public void say(){
        System.out.println("Meow!");
    }
    @Override
    public void play(){
        System.out.println("I'm playing with a ball!");
    }
    /*
    Методы из класса Object, которые крайне желательно должны
    быть в каждом классе.

    Класс Object - базовый класс, который неявно (без слова extends) наследуют абсолютно
    все классы, которые мы создаём.

    Основные методы: toString(), equals(), hashCode()
     */

    /*
    Метод toString() - позволяет вывести объект в нормальном виде. Если мы
    попытаемся вывести наш объект так, как написано в классе Main, то у нас
    выведется адрес ячейки памяти в шестнадцатеричном, в которой лежит наш объект.
    То же самое произойдёт, если мы не переопределим метод toString() класса Object
    в нашем классе.

    Разработчик переопределяет данный метод так, чтобы ему было удобно видеть информацию
    об объекте. В данном случае мы выводим имя и возраст созданной кошки. Пример использования
    написан в Main.
     */
    @Override
    public String toString(){
        return this.getName() + " " + this.getAge();
    }
    /*
    Метод equals() - позволяет сравнить объекты. Возвращает true, если объекты равны и false, если нет
    Если сравнивать объекты через ==, то
    будут сравниваться их ссылки (по сути ссылается ли наша переменная на один и тот же
    объект):

    Cat cat1 = new Cat("Myrka", 3);
    Cat cat2 = new Cat("Myrka", 3);
    System.out.println(cat1 == cat2); - выдаст false, так как в cat2 м создали новую кошку

    Cat cat1 = new Cat("Myrka", 3);
    Cat cat2 = cat1
    System.out.println(cat1 == cat2); - выдаст true, так как кошка cat2 является кошкой cat1

    Метод equals без переопределения делает то же самое.
    Здесь мы его переопределяем так, чтобы он сравнивал наших котов по имени и возрасту. Также
    содержаться два дополнительных условия:
    - проверка на идентичность (1 условие)
    - проверка на совпадение классов

    Использование написано в Main
     */
    @Override
    public boolean equals(Object obj){
        /*
        Проверка: является ли объект, к которому мы применили метод, тем же самым объектом,
        с которым мы его сравниваем
         */
        if(this == obj){
            return true;
        }
        /*
        Проверка - указывает ли текущий объект на null (ни на что) (да, такое бывает) и проверка,
        совпадают ли классы наших объектов, если нет, то логично, что это разные объекты
        || - или
        && - и
         */
        if(obj == null || this.getClass() != obj.getClass()){
            return false;
        }
        /*
        Проверка: если имя текущего объекта равно имени объекта, с которым сравниваем и
        если возраст текущего объекта равен возрасту объекта, с которым сравниваем, то
        возвращаем true.

        Переменную obj приводим к Cat, так как изначально это переменная класса Object.
         */
        if(this.getName() == ((Cat) obj).getName() &&
            this.getAge() == ((Cat) obj).getAge()){
            return true;
        }
        return false; //если ни одно из условий не сработало, то возвращаем false
        /*
        Это стандартная реализация, её можно использоавть постоянно, просто при приведении
        типов в условии сверху использовать имя нужного класса
         */
    }
    /*
    Метод hashCode() - сравнивает объекты по их специальному хеш-коду, который может придумать
    сам пользователь.

    Например, нам надо найти друга из университета, при этом мы знаем, что он живёт в общежитии.
    Мы можем с помощью equals пройтись по всем общежитиям, сравнивая каждого человека с нашим другом.
    А можно отсеять некоторые общежития с помощью hashCode(), присвоив общежитиям номера. Таким образом,
    мы теперь знаем, что, допустим, наш друг живёт в 5 общежитии, и уже только это общежитие мы
    проверяем с помощью equals.

    Также у немного разных объектов может быть одинаковый хеш-код, но у одинаковых объектов
    не может быть разного хеш-кода.

    Иногда достаточно использовать стандартной реализации hashCode() в классе Object, поэтому мы просто
    вызываем метод hashCode() нашего суперкласса (родительского класса Object).

    Саму реализацию hashCode() в классе Object мы не видим, так как она написана на другом языке.
     */
    @Override
    public int hashCode(){
        return super.hashCode(); //super.hashCode() вызывает этот метод из класса Object
    }
}
