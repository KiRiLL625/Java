public class Main {
    public static void main(String[] args) {
        Robot robot1 = new Robot(); //создаём нового робота
        System.out.println(robot1.getX() + " " + robot1.getY() + " " + robot1.getDirection());
        //выводим его координаты и направление, выведет: 0 0 UP
        robot1.setX(5); //устанавливаем координату х = 5
        robot1.setDirection(Direction.LEFT); //устанавливаем направление влево
        System.out.println(robot1.getX() + " " + robot1.getY() + " " + robot1.getDirection());
        //выводим его координаты и направление, выведет: 5 0 LEFT
    }
}
