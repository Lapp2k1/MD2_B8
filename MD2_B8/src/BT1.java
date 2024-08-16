class Circle {
    private double radius;
    private String color;


    public Circle() {
        this.radius = 1.0;
        this.color = "red";
    }


    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public double getArea() {
        return Math.PI * radius * radius;
    }


    @Override
    public String toString() {
        return "Circle[radius=" + radius + ", color=" + color + "]";
    }
}

class Cylinder extends Circle {
    private double height;


    public Cylinder() {
        super();
        this.height = 1.0;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color); // Gọi constructor của lớp cha
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return super.getArea() * height;
    }

    @Override
    public String toString() {
        return "Cylinder[radius=" + getRadius() + ", color=" + getColor() + ", height=" + height + "]";
    }
}
public class BT1 {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println("Thông tin của hình tròn mặc định:");
        System.out.println(circle1);
        System.out.println("Diện tích: " + circle1.getArea());
        System.out.println();


        Circle circle2 = new Circle(2.5, "blue");
        System.out.println("Thông tin của hình tròn tùy chỉnh:");
        System.out.println(circle2);
        System.out.println("Diện tích: " + circle2.getArea());
        System.out.println();

        Cylinder cylinder1 = new Cylinder();
        System.out.println("Thông tin của hình trụ mặc định:");
        System.out.println(cylinder1);
        System.out.println("Thể tích: " + cylinder1.getVolume());
        System.out.println();


        Cylinder cylinder2 = new Cylinder(3.0, "green", 5.0);
        System.out.println("Thông tin của hình trụ tùy chỉnh:");
        System.out.println(cylinder2);
        System.out.println("Thể tích: " + cylinder2.getVolume());
    }
}
