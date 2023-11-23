public class StringComparisonEquals {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "hello";

        // Case-sensitive comparison using equals
        boolean isEqual = str1.equals(str2);

        System.out.println("Are the strings equal? " + isEqual);
    }
}
