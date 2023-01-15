package programs;

public class rectangle {
    int height;
    int width;

    public int calculateArea() {
        return height * width;
    }

    public static void main(String[] args) {
        rectangle rectangle = new rectangle();
        rectangle.height = 10;
        rectangle.width = 8;
        int area = rectangle.calculateArea();
        System.out.println("the area of the rectangle is: " + area);
        ;

    }
}
