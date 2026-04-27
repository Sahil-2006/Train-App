public class UC16 {

    public static void main(String[] args) {
        System.out.println("====================================================");
        System.out.println("UC16 - Manual Sorting using Bubble Sort");
        System.out.println("====================================================\n");

        // Create array of passenger bogie capacities
        int[] capacities = {72, 56, 24, 70, 60};

        // Display original order
        System.out.println("Original Capacities:");
        printArray(capacities);

        // BUBBLE SORT LOGIC
        int n = capacities.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Compare adjacent values
                if (capacities[j] > capacities[j + 1]) {
                    // Swap values
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
            }
        }

        // Display sorted result
        System.out.println("\n\nSorted Capacities (Ascending):");
        printArray(capacities);
        System.out.println("\nUC16 sorting completed...");
    }

    // Helper method to display array
    public static void printArray(int[] arr) {
        for (int c : arr) {
            System.out.print(c + " ");
        }
    }

    // Helper method for testing logic
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
