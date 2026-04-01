import java.util.HashSet;
import java.util.Set;

 class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Step 1: Create HashSet
        Set<String> bogieIDs = new HashSet<>();

        // Step 2: Add bogie IDs
        bogieIDs.add("B101");
        bogieIDs.add("B102");
        bogieIDs.add("B103");
        bogieIDs.add("B101"); // Duplicate
        bogieIDs.add("B102"); // Duplicate

        // Step 3: Display unique bogie IDs
        System.out.println("\nUnique Bogie IDs:");
        System.out.println(bogieIDs);

        // Step 4: Check if a specific ID exists
        boolean exists = bogieIDs.contains("B101");
        System.out.println("\nIs B101 present? " + exists);

        // Step 5: Display total unique count
        System.out.println("Total unique bogies: " + bogieIDs.size());
    }
}