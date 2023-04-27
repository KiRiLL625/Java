public class Cat{
    private String name;
    private int age;
    private String color;
    private static int sleephours = 10;
    //breed
    public Cat(){
        this.name = "Barsik";
        this.age = 5;
        this.color = "grey";
    }
    public Cat(String name, int age, String color){
        this.name = name;
        this.age = age;
        this.color = color;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getColor(){
        return color;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setColor(String color){
        this.color = color;
    }
    public static int getSleephours(){
        return sleephours;
    }
}
