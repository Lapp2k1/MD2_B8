class StaticMethod {

    public static final double PI = 3.14;


    public static double calCircleArea(double R) {
        return PI * R * R;
    }


    public static double calRectangleArea(double width, double height) {
        return width * height;
    }


    public static double calTriangleArea(double a, double b, double c) {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}

public class BT5 {
    public static void main(String[] args) {

        double circleArea1 = StaticMethod.calCircleArea(3.5);
        double circleArea2 = StaticMethod.calCircleArea(6);
        System.out.println("Diện tích hình tròn có bán kính 3.5: " + circleArea1);
        System.out.println("Diện tích hình tròn có bán kính 6: " + circleArea2);

        double triangleArea1 = StaticMethod.calTriangleArea(3, 4, 5);
        double triangleArea2 = StaticMethod.calTriangleArea(4.5, 7, 6);
        System.out.println("Diện tích hình tam giác với các cạnh 3, 4, 5: " + triangleArea1);
        System.out.println("Diện tích hình tam giác với các cạnh 4.5, 7, 6: " + triangleArea2);

        double rectangleArea1 = StaticMethod.calRectangleArea(2.5, 6);
        double rectangleArea2 = StaticMethod.calRectangleArea(4, 7);
        System.out.println("Diện tích hình chữ nhật với kích thước 2.5x6: " + rectangleArea1);
        System.out.println("Diện tích hình chữ nhật với kích thước 4x7: " + rectangleArea2);
    }
}
