public class Main {
    public static void main(String[] args) {
        Robot robot1 = new Robot();
        System.out.println(robot1.getX() + " " + robot1.getY() + " " + robot1.getDirection());
        robot1.setX(5);
        robot1.setDirection(Direction.LEFT);
        System.out.println(robot1.getX() + " " + robot1.getY() + " " + robot1.getDirection());
    }
}

enum Direction{
    DOWN,
    LEFT,
    UP,
    RIGHT
}
public class Robot {
    private int x;
    private int y;
    private Direction direct;
    public Robot(){
        this.x = 0;
        this.y = 0;
        this.direct = Direction.UP;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public Direction getDirection(){
        return direct;
    }
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    public void setDirection(Direction direct){
        this.direct = direct;
    }
}
