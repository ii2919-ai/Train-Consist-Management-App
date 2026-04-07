import java.util.HashSet;
import java.util.Set;

public class TrainApp {
    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("UC3 - Track Unique Bogie IDs");
        System.out.println("======================================");

        Set<String> bogieIds = new HashSet<>();

        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101"); // duplicate
        bogieIds.add("BG102"); // duplicate

        System.out.println("\nBogie IDs after insertion (duplicates ignored):");
        System.out.println(bogieIds);

        System.out.println("\nTotal Unique Bogies: " + bogieIds.size());

        System.out.println("\nSystem ready for next operation...");
    }
}