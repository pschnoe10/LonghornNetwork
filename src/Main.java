import java.io.IOException;
import java.util.*;

/**
 * Main is the main class that takes a String as an input.
 * args is the inputted string used to determine which command-line argument the user wants to use.
 * parseStudents will parse the data from the inputted args.
 * assignRoommates will run the Gale-Shapely algorithm on the list of University students obtained from the parsed inputFile.
 * formPods is the method that will generate the pod formation based on each student's pod attributes
 *
 */

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide the input file name as a command-line argument.");
            return;
        }
        String inputFile = args[0];
        try {
            List<UniversityStudent> students = DataParser.parseStudents(inputFile);

            // Roommate matching
            GaleShapley.assignRoommates(students);

            // Pod formation
            StudentGraph graph = new StudentGraph(students);
            PodFormation podFormation = new PodFormation(graph);
            podFormation.formPods(4);

            // Referral path finding
            ReferralPathFinder pathFinder = new ReferralPathFinder(graph);
            // TODO: Implement user interaction for specifying a target company

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
