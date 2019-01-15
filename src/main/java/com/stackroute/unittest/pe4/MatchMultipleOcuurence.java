import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**TWrite a program to find out the multiple occurrences of the given word in a string using Matcher methods.
 *
 * @version 1.0 11-1-2018
 *
 * @author Uday N
 */

public class MatchMultipleOcuurence {

    public  String[] matchMultipleOcuurenceOfString(String str,String match)
    {
        if(str.length()>0 && str.length()>0) {
            List<String> list = new ArrayList<String>();
            Pattern pattern = Pattern.compile(match);
            Matcher mat = pattern.matcher(str);
            while (mat.find()) {
                String str1 = "Found at: " + mat.start() + "-" + mat.end();
                list.add(str1);
            }
            String[] arr = new String[list.size()];
            arr = list.toArray(arr);

            return arr;
        }
        else
        {
         return null;
        }
    }
}
