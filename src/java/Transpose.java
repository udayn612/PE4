import java.util.Scanner;

public class Transpose {

    public  String transpose(String input)
    {

        if( input != null && input.length()>0) {



                String[] arr = input.split(" ");

                String str = "";
                for (String s : arr) {
                    str += reverseString(s);
                    str = str + " ";
                }
                return str.trim();

        }
        else
        {
            return "Input should be not be empty or null";
        }




    }

    public static String reverseString(String s)
    {
        String str="";
        for(int i=s.length()-1;i>=0;i--)
        {
            str+=s.charAt(i);
        }
        return  str;
    }

    public static void main(String[] args) {
        Transpose tr=new Transpose();
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        System.out.println(tr.transpose(input));

    }
}
