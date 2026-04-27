import java.util.Arrays;

public class UC19 {

    public static void main(String[] args) {
        System.out.println("====================================================");
        System.out.println("UC19 - Binary Search for Bogie ID ");
        System.out.println("====================================================\n");

        // Create array of bogie IDs
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        // Ensure data is sorted (Precondition for Binary Search)
        Arrays.sort(bogieIds);

        // Search key
        String searchKey = "BG309";

        // Display available bogies
        System.out.println("Sorted Bogie IDs:");
        System.out.println(Arrays.toString(bogieIds));

        // Perform Binary Search
        boolean found = binarySearch(bogieIds, searchKey);

        // Display Result
        if (found) {
            System.out.println("\nBogie " + searchKey + " found using Binary Search.");
        } else {
            System.out.println("\nBogie " + searchKey + " not found.");
        }

        System.out.println("\nUC19 search completed...");
    }

    /**
     * Performs Binary Search on a sorted array of String IDs.
     * Time Complexity: O(log n)
     */
    public static boolean binarySearch(String[] array, String key) {
        // Handle Empty Array
        if (array == null || array.length == 0) {
            return false;
        }

        // Ensure array is sorted (Requirement: "If input is not sorted, the system should sort...")
        Arrays.sort(array);

        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int comparison = array[mid].compareTo(key);

            if (comparison == 0) {
                return true; // Key found
            } else if (comparison < 0) {
                low = mid + 1; // Search right half
            } else {
                high = mid - 1; // Search left half
            }
        }
        return false; // Key not found
    }
}
