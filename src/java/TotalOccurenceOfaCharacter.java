import java.util.Scanner;

public class TotalOccurenceOfaCharacter {

    public  int totalOccurenceOfCharacter(String input)
    {
        int charcount=input.length()-input.replaceAll("a","").length();
        return charcount;
    }

    public static void main(String[] args) {
        TotalOccurenceOfaCharacter total=new TotalOccurenceOfaCharacter();
        Scanner sc =new Scanner(System.in);
        String input=sc.nextLine();
        System.out.println(total.totalOccurenceOfCharacter(input));
    }
}
