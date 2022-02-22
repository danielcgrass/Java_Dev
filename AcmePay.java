import java.util.*;

public class AcmePay {
    public static void main(String[] args) throws Exception {
        int hoursWorked;
        int shiftNum;
        int retirementPlan = 0;
        final int SHIFT_ONE = 1;
        final int SHIFT_TWO = 2;
        final int SHIFT_THREE = 3;
        double retirementDeduction = 0.03;
        double payRate = 0.00;
        double paycheck = 0.00;
        double paycheckDeducted = 0.00;
        double overtime = 0.00;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter number of hours worked >> ");
        hoursWorked = keyboard.nextInt();
        System.out.print("Enter shift >> ");
        shiftNum = keyboard.nextInt();
        switch (shiftNum) {
            case (SHIFT_ONE): {
                payRate = 17.00;
                if (hoursWorked > 40) {
                    overtime = ((hoursWorked - 40) * payRate) * 1.5;
                    paycheck = payRate * hoursWorked;
                } else {
                    paycheck = payRate * hoursWorked;
                }
                break;
            }
            case (SHIFT_TWO): {
                payRate = 18.50;
                if (hoursWorked > 40) {
                    overtime = ((hoursWorked - 40) * payRate) * 1.5;
                    paycheck = payRate * hoursWorked;
                } else {
                    paycheck = payRate * hoursWorked;
                }
                System.out.print("Add to retirement fund? 1 for YES 2 for NO >> ");
                retirementPlan = keyboard.nextInt();
                if (retirementPlan == 1) {
                    paycheck = (payRate * hoursWorked);
                    paycheckDeducted = (paycheck * retirementDeduction);

                } else {
                    paycheck = payRate * hoursWorked;
                }
                break;
            }
            case (SHIFT_THREE): {
                payRate = 22.00;
                if (hoursWorked > 40) {
                    overtime = ((hoursWorked - 40) * payRate) * 1.5;
                    paycheck = payRate * hoursWorked;
                } else {
                    paycheck = payRate * hoursWorked;
                }
                System.out.print("Add to retirement fund? 1 for YES 2 for NO >> ");
                retirementPlan = keyboard.nextInt();
                if (retirementPlan == 1) {
                    paycheck = (payRate * hoursWorked);
                    paycheckDeducted = (paycheck * retirementDeduction);

                } else {
                    paycheck = payRate * hoursWorked;
                }
                break;
            }
        }

        System.out.println("Hours worked: " + hoursWorked);
        System.out.println("Shift number: " + shiftNum);
        System.out.println("Hourly Rate: " + payRate);
        System.out.println("Regular pay: " + paycheck);
        System.out.println("Overtime: " + overtime);
        System.out.println("Total of regular & overtime: " + (paycheck + overtime));
        System.out.println("Retirement Deduction: " + paycheckDeducted);
        System.out.println("Netpay: " + ((paycheck + overtime) - paycheckDeducted));
    }
}