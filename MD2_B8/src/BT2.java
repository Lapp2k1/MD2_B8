
 class Point2D {

    private float x;
    private float y;


    public Point2D() {
        this.x = 0.0f;
        this.y = 0.0f;
    }

    public Point2D(float x, float y) {
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


class Point3D extends Point2D {

    private float z;


    public Point3D() {
        super();
        this.z = 0.0f;
    }


    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }


    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }


    public void setXYZ(float x, float y, float z) {
        super.setXY(x, y);
        this.z = z;
    }


    public float[] getXYZ() {
        return new float[] {super.getX(), super.getY(), z};
    }


    @Override
    public String toString() {
        return "(" + super.getX() + ", " + super.getY() + ", " + z + ")";
    }
}

public class BT2 {
    public static void main(String[] args) {

        Point2D point2D1 = new Point2D();
        System.out.println("Thông tin của Point2D mặc định:");
        System.out.println(point2D1);
        System.out.println("Tọa độ X và Y: " + point2D1.getX() + ", " + point2D1.getY());
        System.out.println();


        Point2D point2D2 = new Point2D(3.0f, 4.0f);
        System.out.println("Thông tin của Point2D tùy chỉnh:");
        System.out.println(point2D2);
        System.out.println("Tọa độ X và Y: " + point2D2.getX() + ", " + point2D2.getY());
        System.out.println();

        Point3D point3D1 = new Point3D();
        System.out.println("Thông tin của Point3D mặc định:");
        System.out.println(point3D1);
        System.out.println("Tọa độ X, Y và Z: " + point3D1.getX() + ", " + point3D1.getY() + ", " + point3D1.getZ());
        System.out.println();

        Point3D point3D2 = new Point3D(1.5f, 2.5f, 3.5f);
        System.out.println("Thông tin của Point3D tùy chỉnh:");
        System.out.println(point3D2);
        System.out.println("Tọa độ X, Y và Z: " + point3D2.getX() + ", " + point3D2.getY() + ", " + point3D2.getZ());
        System.out.println();


        point3D2.setXY(7.0f, 8.0f);
        point3D2.setZ(9.0f);
        System.out.println("Thông tin của Point3D sau khi thay đổi tọa độ:");
        System.out.println(point3D2);
        System.out.println("Tọa độ X, Y và Z: " + point3D2.getX() + ", " + point3D2.getY() + ", " + point3D2.getZ());
    }
}
