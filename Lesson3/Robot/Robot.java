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
