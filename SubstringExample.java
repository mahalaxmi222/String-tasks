public class SubstringExample {
    public static void main(String[] args) {
        String originalString = "Hello, World!";

        // Extract a substring starting from index 7
        String substring1 = originalString.substring(7);

        // Extract a substring from index 7 to 12 (exclusive)
        String substring2 = originalString.substring(7, 12);

        System.out.println("Substring 1: " + substring1);
        System.out.println("Substring 2: " + substring2);
    }
}
