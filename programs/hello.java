package programs; // the folder name is taken by the 

public class hello { // probably the file name is taken by
    public static void main(String args[]) {
        String a, b; // initialization
        a = "this is a string"; // string
        b = "this is the second string,lets see if it works"; // string
        System.out.println(a + b); // the string gets concatenated
    }

    public class Rectangle {
        int width;
        public int height;

        public int calculateArea() {
            return width * height;
        }
    }

}
