package BTBuoi3.BT3so1;

public class Ball {
    private float x;
    private float y;
    private int radius ;
    private float xDelta;
    private float yDelta;
    public Ball(float x,float y,int radius,float xDelta, float yDelta){
        this.x=x;
        this.y=y;
        this.radius=radius;
        this.xDelta=xDelta;
        this.yDelta=yDelta;

    }

    public void setX(float x) {
        this.x = x;
    }

    public float getX() {
        return x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getY() {
        return y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setxDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    public float getxDelta() {
        return xDelta;
    }

    public void setyDelta(float yDelta) {
        this.yDelta = yDelta;
    }

    public float getyDelta() {
        return yDelta;
    }
    public void move(){
    x+=xDelta;
    y+=yDelta;
    }
    public void reflectHorizontal(){
    xDelta=-xDelta;
    }
    public void reflectVẻtical(){
  yDelta=-yDelta;
    }

    @Override
    public String toString() {
        return "Ball[("+x+","+y+"),speed=("+xDelta+","+yDelta+")]";
    }
}
