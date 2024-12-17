import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class LockerFileHandler {
    private static final String INPUT_FILE = "/home/xhyth3r/SoureCodes/Netbeans/CLIS/src/main/java/in/out_files/input.in";
    private static final String OUTPUT_FILE = "/home/xhyth3r/SoureCodes/Netbeans/CLIS/src/main/java/in/out_files/out.out";

    // Method to save all lockers to the file
    // Method to save all lockers to the file
    public static void saveLockersToFile(List<Locker> lockers) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(OUTPUT_FILE))) {
            for (Locker locker : lockers) {
                writer.write(locker.toFileString());  // Corrected call to toFileString without any arguments
                writer.newLine();  // Add a newline between lockers
            }
            System.out.println("Lockers saved successfully.");
        } catch (IOException e) {
            System.out.println("Error while saving lockers: " + e.getMessage());
        }
    }


    // Method to load all lockers from the file
    public static List<Locker> loadLockersFromFile() {
    List<Locker> lockers = new ArrayList<>();
    try (BufferedReader reader = new BufferedReader(new FileReader(INPUT_FILE))) {
        String line;
        Locker currentLocker = null;

        while ((line = reader.readLine()) != null) {
            if (line.trim().isEmpty()) continue;

            if (line.matches("\\d+")) { // Locker ID
                if (currentLocker != null) {
                    lockers.add(currentLocker); // Add previous locker if it exists
                }
                currentLocker = new Locker(Integer.parseInt(line.trim())); // Create new locker
            } else if (currentLocker != null) {
                if (!line.contains(",")) {
                    currentLocker.setUserName(line.trim()); // Set the username
                } else { // Item line
                    String[] itemParts = line.split(",");
                    if (itemParts.length == 3) {
                        String itemKey = itemParts[0].trim();
                        String itemName = itemParts[1].trim();
                        int quantity = Integer.parseInt(itemParts[2].trim());
                        Items newItem = new Items(itemName, itemKey, quantity);
                        currentLocker.addItem(newItem); // Add item to locker
                    }
                }
            }
        }
        if (currentLocker != null) {
            lockers.add(currentLocker); // Add the last locker
        }
    } catch (IOException e) {
        System.err.println("Error while loading lockers: " + e.getMessage());
    }
    return lockers;
}

}
