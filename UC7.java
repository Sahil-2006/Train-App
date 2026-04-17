import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * =========================================================
 * MAIN CLASS - UseCase7TrainConsistMgmt
 * =========================================================
 * *
 * * Use Case 7: Sort Bogies by Capacity (Comparator)
 * *
 * * Description:
 * * This class sorts passenger bogies based on seating
 * * capacity using a custom Comparator.
 * *
 * * At this stage, the application:
 * * - Creates bogie objects
 * * - Stores them in a List
 * * - Displays unsorted data
 * * - Sorts using Comparator logic
 * * - Displays sorted result
 * *
 * * This maps custom ordering using Comparator.
 * *
 * * @author Developer
 * * @version 7.0
 */
public class UseCase7TrainConsistMgmt {

    // Inner Bogie class to model passenger bogies
    static class Bogie {
        String name;
        int capacity;

        public Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }
    }

    public static void main(String[] args) {
        
        System.out.println("========================================");
        System.out.println(" UC7 - Sort Bogies by Capacity (Comparator) ");
        System.out.println("========================================\n");
        
        // Create list of passenger bogies
        List<Bogie> bogies = new ArrayList<>();
        
        // Add bogie objects to the list
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("General", 90));
        
        // Display unsorted data
        System.out.println("Before Sorting:");
        for (Bogie b : bogies) {
            System.out.println(b.name + " -> " + b.capacity);
        }
        System.out.println();
        
        // Sort using Comparator logic based on the capacity field
        bogies.sort(Comparator.comparingInt(b -> b.capacity));
        
        // Display sorted result
        System.out.println("After Sorting by Capacity:");
        for (Bogie b : bogies) {
            System.out.println(b.name + " -> " + b.capacity);
        }
        System.out.println();
        
        System.out.println("UC7 sorting completed...");
    }
}
