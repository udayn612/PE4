import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**Write a program that sets up a String variable containing a paragraph of text of your choice.
 a. Extract the words from the text and sort them into alphabetical order.
 b. Display the sorted list of words.
 * @version 1.0 11-1-2018
 *
 * @author Uday N
 */

public class ExtractParagraph {

    public static String[] extract(String input)
    {
        String[] arr=input.split(" ");

        Arrays.sort(arr);
        for(String s:arr)
            System.out.println(s);
        return  arr;
    }

}
