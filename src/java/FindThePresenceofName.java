import java.util.Scanner;

public class FindThePresenceofName {

    public  boolean findtheNameInaString(String s,String match)
    {
        return s.matches(".*\\b"+match+"\\b.*");
    }

    public static void main(String[] args) {
        FindThePresenceofName fp =new FindThePresenceofName();
        Scanner input=new Scanner(System.in);
        String s=input.nextLine();
        System.out.println(fp.findtheNameInaString(s,"harry"));

    }
}
