public class StringComparisonEqualsIgnoreCase {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "hello";

        // Case-insensitive comparison using equalsIgnoreCase
        boolean isEqual = str1.equalsIgnoreCase(str2);

        System.out.println("Are the strings equal (ignoring case)? " + isEqual);
    }
}
