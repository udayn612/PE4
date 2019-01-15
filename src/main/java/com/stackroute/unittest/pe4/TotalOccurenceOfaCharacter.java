import java.util.Scanner;


/**Write a java program to count the total number of occurrences of a given character in a string without using any loop?
 *
 * @version 1.0 11-1-2018
 *
 * @author Uday N
 */

public class TotalOccurenceOfaCharacter {

    public  int totalOccurenceOfCharacter(String input)
    {
        int charcount=input.length()-input.replaceAll("a","").length();
        return charcount;
    }
}
