import java.util.Scanner;

public class ReplacePerticularCharacter {

    public static String replacePerticularCharacter(String input)
    {
        String newString=input.replaceAll("d","f");
        String newString2=newString.replaceAll("l","t");
        return  newString2;

    }


    public static void main(String[] args) {

        ReplacePerticularCharacter replace =new ReplacePerticularCharacter();
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        System.out.println(replace.replacePerticularCharacter(input));

    }
}
