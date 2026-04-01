import java.util.ArrayList;
import java.util.List;

 class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Step 1: Create ArrayList
        List<String> passengerBogies = new ArrayList<>();

        // Step 2: Add bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // Step 3: Display after insertion
        System.out.println("\nAfter adding bogies:");
        System.out.println(passengerBogies);

        // Step 4: Remove a bogie (AC Chair)
        passengerBogies.remove("AC Chair");

        // Step 5: Display after removal
        System.out.println("\nAfter removing AC Chair:");
        System.out.println(passengerBogies);

        // Step 6: Check existence
        boolean exists = passengerBogies.contains("Sleeper");

        System.out.println("\nIs 'Sleeper' present? " + exists);

        // Step 7: Final state
        System.out.println("\nFinal Train Consist:");
        System.out.println(passengerBogies);
    }
}