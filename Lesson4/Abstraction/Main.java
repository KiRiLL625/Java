public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal(); //ошибка - объект абстрактного класса нельзя создать
        Animal pet = new Cat();
        pet.go(); //вывод: "Cat jumps"
        pet.say(); //вывод: "Animal says" (так как метод say() не переопределён в классе Cat)
        pet = new Dog();
        pet.go(); //вывод: "Dog runs"
        pet.say(); //вывод: "Animal says" (так как метод say() не переопределён в классе Dog)
    }
}
