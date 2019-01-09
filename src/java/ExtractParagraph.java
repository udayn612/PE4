import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ExtractParagraph {

    public static String[] extract(String input)
    {
        String[] arr=input.split(" ");

        Arrays.sort(arr);
        for(String s:arr)
            System.out.println(s);
        return  arr;
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        String[] result=extract(input);
        System.out.println(result);
    }
}
