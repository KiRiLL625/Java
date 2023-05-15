import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
      //создаём массив животных размера 2
      Animal[] animals = new Animal[2];
      /*добавили в массив животных кота и собаку. Так сделать можно,
      так как кот и собака - наследники Animal.
      */
      animals[0] = new Cat("Tom", 3, "white");
      animals[1] = new Dog("Barbos", 5);
      //выводим их в консоль с помощью цикла foreach
      for(Animal animal: animals){
        System.out.println(animal); //в цикле animal принимает значения массива animals. 
      }
    }
}
