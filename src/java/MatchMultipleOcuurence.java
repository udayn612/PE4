import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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


    public static void main(String[] args) {

        MatchMultipleOcuurence mt=new MatchMultipleOcuurence();
        Scanner sc=new Scanner(System.in);
        String text=sc.nextLine();
        String match=sc.nextLine();
        String[] res=mt.matchMultipleOcuurenceOfString(text,match);
        for(String s:res)
            System.out.println(s);


    }
}
