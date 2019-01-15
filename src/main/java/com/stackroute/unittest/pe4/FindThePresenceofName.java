import java.util.Scanner;


/**Write a program with the implementation of Regular Expression to find the presence of the name Harry in a string.
 *
 * @version 1.0 11-1-2018
 *
 * @author Akshay Badiger
 */

public class FindThePresenceofName {

    public  boolean findtheNameInaString(String s,String match)
    {
        return s.matches(".*\\b"+match+"\\b.*");
    }

}
