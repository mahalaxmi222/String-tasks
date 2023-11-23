public class StringCodePointCountExample {
    public static void main(String[] args) {
        String myString = "Hello, World!";

        // Get the number of Unicode code points in the string
        int length = myString.codePointCount(0, myString.length());

        System.out.println("Length of the string: " + length);
    }
}
