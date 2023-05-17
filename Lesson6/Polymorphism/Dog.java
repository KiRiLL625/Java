//класс Dog, наследующий Animal и переопределяющий метод say()
 class Dog extends Animal {
    public Dog(String name, int age){
        super(name, age);
    }
    //Переопределение say()
    @Override
    public void say(){
        System.out.println("Dog barks!");
    }
}
