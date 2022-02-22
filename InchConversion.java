import java.util.Scanner;

public class InchConversion {
    public static void main(String args[]) {
        int inches;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter number of inches >> ");
        inches = keyboard.nextInt();
        convertToFeet(inches);
        convertToYards(inches);
    }

    public static void convertToFeet(int inches) {
        double totalFeet;
        final int ONE_FOOT = 12;

        totalFeet = inches / ONE_FOOT;
        System.out.println("Number of feet: " + totalFeet);
    }

    public static void convertToYards(int inches) {
        double totalYards;
        final double ONE_YARD = 36;
        totalYards = inches / ONE_YARD;

        System.out.println("Number of yards: " + totalYards);
    }
}
