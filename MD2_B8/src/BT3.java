class Point {

    private float x;
    private float y;


    public Point() {
        this.x = 0.0f;
        this.y = 0.0f;
    }


    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }


    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }


    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        return new float[] {x, y};
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

class MovablePoint extends Point {
    private float xSpeed;
    private float ySpeed;


    public MovablePoint() {
        super(); // Gọi constructor của lớp cha
        this.xSpeed = 0.0f;
        this.ySpeed = 0.0f;
    }


    public MovablePoint(float xSpeed, float ySpeed) {
        super(); // Gọi constructor của lớp cha
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }


    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y); // Gọi constructor của lớp cha
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }


    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }


    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }


    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }


    public float[] getSpeed() {
        return new float[] {xSpeed, ySpeed};
    }


    @Override
    public String toString() {
        return super.toString() + ", speed=(" + xSpeed + ", " + ySpeed + ")";
    }


    public MovablePoint move() {
        setX(super.getX() + xSpeed);
        setY(super.getY() + ySpeed);
        return this;
    }
}
public class BT3 {
    public static void main(String[] args) {

        Point point1 = new Point();
        System.out.println("Thông tin của Point mặc định:");
        System.out.println(point1);
        System.out.println();


        Point point2 = new Point(5.5f, 7.5f);
        System.out.println("Thông tin của Point tùy chỉnh:");
        System.out.println(point2);
        System.out.println();


        MovablePoint movablePoint1 = new MovablePoint();
        System.out.println("Thông tin của MovablePoint mặc định:");
        System.out.println(movablePoint1);
        System.out.println();


        MovablePoint movablePoint2 = new MovablePoint(1.0f, 2.0f);
        System.out.println("Thông tin của MovablePoint với tốc độ tùy chỉnh:");
        System.out.println(movablePoint2);
        System.out.println();


        MovablePoint movablePoint3 = new MovablePoint(3.0f, 4.0f, 0.5f, 1.5f);
        System.out.println("Thông tin của MovablePoint với tọa độ và tốc độ tùy chỉnh:");
        System.out.println(movablePoint3);
        System.out.println();


        System.out.println("Thông tin của MovablePoint sau khi di chuyển:");
        movablePoint3.move();
        System.out.println(movablePoint3);
    }
}
