/Program prompts user to enter a series of integers

// separated by spaces
// Program converts them to numbers and sums them
import java.util.*;

public class FixedJavaDebug {
    public static void main(String[] args) {
        String str;
        int x;
        int length;
        int start = 0;
        int num;
        int lastSpace = -1;
        int sum = 0;
        String partStr;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a series of integers separated by spaces >> ");
        str = in.nextLine();

        /*
         * Replace the statement 'length = length();' with 'length = str.length();'. The
         * length() method returns the number of characters in the string str.
         */
        length = str.length(); // modified statement

        /*
         * Replace the statement 'for(x = 0; x <= length; ++x)' with 'for(x = 0; x <
         * length; ++x)'. The position of the first character in a string is 0 and the
         * last characters is its length-1.
         */
        for (x = 0; x < length; ++x) // modified statement
        {
            /*
             * Replace the statement 'if(str.charAt(x) == " ")' with 'if(str.charAt(x) == '
             * ')'. A character cannot be compared with a string and can be compared with
             * another character.
             */
            if (str.charAt(x) == ' ') // modified statement
            {
                /*
                 * Replace the statement 'partStr = str.substring(x, lastSpace + 1);' with
                 * 'partStr = str.substring(lastSpace + 1, x);'. The starting position of a
                 * substring must be less than the ending position the substring.
                 */
                partStr = str.substring(lastSpace + 1, x); // modified statement
                num = Integer.parseInt(partStr);
                System.out.println(" " + num);

                /*
                 * Replace the statement 'sum = num;' with 'sum += num;'. Need to use the '+'
                 * (plus sign) to find the sum of numbers.
                 */
                sum += num; // modified statement

                /*
                 * Replace the statement 'lastSpace == x;' with 'lastSpace = x;'. Need to use
                 * the '=' (assignment operator) to assign a value to a variable.
                 */
                lastSpace = x; // modified statement
            }
        }
        partStr = str.substring(lastSpace + 1, length);
        num = Integer.parseInt(partStr);
        System.out.println(" " + num);

        /*
         * Replace the statement 'sum = num;' with 'sum += num;'. Need to use the '+'
         * (plus sign) to find the sum of numbers.
         */
        sum += num; // modified statement

        System.out.println(" -------------------" + "\nThe sum of the integers is " + sum);
    }
}