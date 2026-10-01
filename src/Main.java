import java.util.Scanner;

class PartyAffiliation {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // Show choices
        System.out.println("D - Democrat");
        System.out.println("R - Republican");
        System.out.println("I - Independent");

        // Get user's choice
        System.out.print("Enter your choice: ");
        String choice = in.nextLine();

        // Check party affiliation
        if (choice.equals("D")) {
            System.out.println("You get a Democratic Donkey.");
        } else if (choice.equals("R")) {
            System.out.println("You get a Republican Elephant.");
        } else if (choice.equals("I")) {
            System.out.println("You get an Independent Person.");
        } else {
            System.out.println("You chose Other.");
        }
    }
}