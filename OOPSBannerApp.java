public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] lines = {
            String.join("  ", " *** ",   "  '***","******", "*****"),
            String.join("  ", "**  **", "**  **", "**  **", "*    *"),
            String.join("  ", "**  **", "**  **", "**  **", "**   "),
            String.join("  ", "**  **", "**  **", "******", " *** "),
            String.join("  ", "**  **", "**  **", "**    ", "   **"),
            String.join("  ", "**  **", "**  **", "**    ", "   **"),
            String.join("  ", "**  **", "**  **", "**    ", "*   **"),
            String.join("  ", " *** ", "  *** ",  "**    ", "*****")
        };

        // Use a loop to print each line of the banner to create the
        // visual effect for the message "OOPS"
        for (String line : lines) {
            System.out.println(line);
        }
    }
}