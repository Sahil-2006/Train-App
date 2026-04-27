import java.util.Arrays;

public class UC17 {

    public static void main(String[] args) {
        System.out.println("====================================================");
        System.out.println("UC17 - Sort Bogie Names Using Arrays.sort()");
        System.out.println("====================================================\n");

        // Create array of bogie names
        String[] bogieNames = {"Sleeper", "AC Chair", "First Class", "General", "Luxury"};

        // Display original order
        System.out.println("Original Bogie Names:");
        System.out.println(Arrays.toString(bogieNames));

        // Use Arrays.sort() for sorting
        Arrays.sort(bogieNames);

        // Display sorted results
        System.out.println("\nSorted Bogie Names (Alphabetical):");
        System.out.println(Arrays.toString(bogieNames));

        System.out.println("\nUC17 sorting completed...");
    }

    // Helper method for testing logic
    public static void sortBogies(String[] names) {
        Arrays.sort(names);
    }
}
