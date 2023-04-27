public class Main {
    public static void main(String[] args) {
        Robot robot1 = new Robot();
        System.out.println(robot1.getX() + " " + robot1.getY() + " " + robot1.getDirection());
        robot1.setX(5);
        robot1.setDirection(Direction.LEFT);
        System.out.println(robot1.getX() + " " + robot1.getY() + " " + robot1.getDirection());
    }
}
