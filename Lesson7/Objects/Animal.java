//Стандартный класс Animal с getter'ами и setter'ами
//(getAge, getName, setAge, setName)
public class Animal {
    private String name;
    private int age;
    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}
