import java.util.Scanner;

public class ChiliToGo {
    public static void main(String[] args) {
        byte numAdultMeals, numKidMeals;
        final double ADULT_MEAL = 7.00;
        final double KID_MEAL = 4.00;
        double TOTALADULT, TOTALKID, TOTAL;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter adult meals >> ");
        numAdultMeals = input.nextByte();
        System.out.print("Enter kids meals >> ");
        numKidMeals = input.nextByte();
        TOTALADULT = (numAdultMeals * ADULT_MEAL);
        TOTALKID = (numKidMeals * KID_MEAL);
        TOTAL = TOTALADULT + TOTALKID;

        System.out.println("Total adult meals = $" + TOTALADULT);
        System.out.println("Total kid meals = $" + TOTALKID);
        System.out.print("Total: " + TOTAL);
    }
}
