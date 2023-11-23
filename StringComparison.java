public class StringComparison {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "java";

        // Compare strings (case-sensitive)
        boolean isEqual = str1.equals(str2);

        // Compare strings (case-insensitive)
        boolean isEqualIgnoreCase = str1.equalsIgnoreCase(str2);

        // Print the results
        System.out.println("Case-Sensitive Comparison: " + isEqual);
        System.out.println("Case-Insensitive Comparison: " + isEqualIgnoreCase);
    }
}
