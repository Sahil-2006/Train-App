import java.util.Scanner;
import java.util.regex.Pattern;

public class UC11 {

    // Regex constants
    private static final String TRAIN_ID_REGEX = "TRN-\\d{4}";
    private static final String CARGO_CODE_REGEX = "PET-[A-Z]{2}";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==========================================");
        System.out.println("UC111 - Validate Train ID and Cargo Code");
        System.out.println("==========================================");

        // 1. Accept and Validate Train ID
        System.out.print("Enter Train ID (Format: TRN-1234): ");
        String trainId = scanner.nextLine();
        boolean isTrainIdValid = isValid(trainId, TRAIN_ID_REGEX);

        // 2. Accept and Validate Cargo Code
        System.out.print("Enter Cargo Code (Format: PET-AB): ");
        String cargoCode = scanner.nextLine();
        boolean isCargoCodeValid = isValid(cargoCode, CARGO_CODE_REGEX);

        // 3. Display Results
        System.out.println("\nValidation Results:");
        System.out.println("Train ID Valid: " + isTrainIdValid);
        System.out.println("Cargo Code Valid: " + isCargoCodeValid);
        System.out.println("\nUC111 validation completed...");

        scanner.close();
    }

    /**
     * Helper method to validate input against a regex pattern.
     * Uses Pattern.matches() for full string validation.
     */
    public static boolean isValid(String input, String regex) {
        if (input == null || input.isEmpty()) {
            return false;
        }
        return Pattern.matches(regex, input);
    }
}
