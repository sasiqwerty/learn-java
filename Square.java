
public class Square { // The Square class is defined with an instance variable side to represent the
                      // length of the side of the square.
    int side;

    public int calculateArea() { // The calculateArea() method is defined within the Square class, it does not
                                 // take any parameters and it returns an integer. The method uses the side field
                                 // of the class to calculate the area of the square.
        return side * side;
    }

    public static void main(String[] args) { // The main method is the entry point of the program and it creates an
                                             // instance of the Square class, assigns a value to the side variable and
                                             // calls the calculateArea method.
        Square square = new Square();
        square.side = 5;
        int area = square.calculateArea();
        System.out.println("The area of the square is: " + area); // The result is then printed to the console using the
                                                                  // System.out.println method.
    }
}
