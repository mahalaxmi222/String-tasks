public class SubstringBeforeAfterExample {
    public static void main(String[] args) {
        String originalString = "Java Programming";

        // Extract substring before the first space
        String beforeSpace = originalString.substring(0, originalString.indexOf(" "));

        // Extract substring after the first space
        String afterSpace = originalString.substring(originalString.indexOf(" ") + 1);

        System.out.println("Substring before space: " + beforeSpace);
        System.out.println("Substring after space: " + afterSpace);
    }
}
