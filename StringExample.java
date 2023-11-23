public class StringExample {
    public static void main(String[] args) {
        // Declare and initialize a string
        String message = "Hello, Java!";

        // Display the original string
        System.out.println("Original Message: " + message);

        // Obtain the length of the string
        int length = message.length();
        System.out.println("Length of the Message: " + length);

        // Concatenate strings
        String newMessage = message + " Welcome!";
        System.out.println("Concatenated Message: " + newMessage);

        // Access characters in a string
        char firstChar = message.charAt(0);
        char lastChar = message.charAt(length - 1);
        System.out.println("First Character: " + firstChar);
        System.out.println("Last Character: " + lastChar);

        // Substring
        String substring = message.substring(7, 11);
        System.out.println("Substring: " + substring);

        // Convert to uppercase and lowercase
        String upperCaseMessage = message.toUpperCase();
        String lowerCaseMessage = message.toLowerCase();
        System.out.println("Uppercase: " + upperCaseMessage);
        System.out.println("Lowercase: " + lowerCaseMessage);

        // Check if the string contains a specific substring
        boolean containsJava = message.contains("Java");
        System.out.println("Contains 'Java': " + containsJava);

        // Replace characters in the string
        String replacedMessage = message.replace('o', '0');
        System.out.println("String after replacement: " + replacedMessage);
    }
}
