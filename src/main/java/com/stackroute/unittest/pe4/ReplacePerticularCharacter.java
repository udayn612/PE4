import java.util.Scanner;


/**Write a program to replace all d with f and all l with t in the given String
 *
 * @version 1.0 11-1-2018
 *
 * @author Uday N
 */

public class ReplacePerticularCharacter {

    public static String replacePerticularCharacter(String input)
    {
        String newString=input.replaceAll("d","f");
        String newString2=newString.replaceAll("l","t");
        return  newString2;

    }

}
