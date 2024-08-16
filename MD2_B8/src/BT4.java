import java.util.Scanner;

class Shape {
    private String color;


    public Shape() {
        this.color = "unknown";
    }

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Shape with color: " + color;
    }
}

class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;


    public Triangle() {
        this.side1 = 1.0;
        this.side2 = 1.0;
        this.side3 = 1.0;
    }


    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }


    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }


    public double getArea() {
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }


    public double getPerimeter() {
        return side1 + side2 + side3;
    }


    @Override
    public String toString() {
        return "Ba cạnh của tam giác: " + side1 + ", " + side2 + ", " + side3 +
                ", Màu: " + super.getColor() +
                ", Diện tích: " + getArea() +
                ", Chu vi: " + getPerimeter();
    }
}

public class BT4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double side1, side2, side3;
        String color;
        do {
            System.out.print("Nhập độ dài cạnh thứ nhất: ");
            side1 = scanner.nextDouble();

            System.out.print("Nhập độ dài cạnh thứ hai: ");
            side2 = scanner.nextDouble();

            System.out.print("Nhập độ dài cạnh thứ ba: ");
            side3 = scanner.nextDouble();


        } while (!(side1 + side2 > side3) && !(side1 + side3 > side2) && !(side2 + side3 > side1));

        System.out.print("Nhập màu sắc của tam giác: ");
        color = scanner.next();

        Triangle triangle = new Triangle(side1, side2, side3);
        triangle.setColor(color);


        System.out.println(triangle.toString());


    }
}
