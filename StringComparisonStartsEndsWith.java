public class StringComparisonStartsEndsWith {
    public static void main(String[] args) {
        String str = "Hello, World!";

        // Check if the string starts with a specific prefix
        boolean startsWithHello = str.startsWith("Hello");

        // Check if the string ends with a specific suffix
        boolean endsWithWorld = str.endsWith("World!");

        System.out.println("Starts with 'Hello'? " + startsWithHello);
        System.out.println("Ends with 'World!'? " + endsWithWorld);
    }
}
