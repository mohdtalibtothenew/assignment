
import java.util.regex.*;
import java.util.Scanner;

public class OccurrenceCount {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str1 = sc.nextLine();
        System.out.println("Enter Character ");
        String ch =sc.next();
        int charcount = str1.length() - str1.replaceAll("[a-z]", "").length();
        System.out.println("Occurrence Of "+ ch+" Char In String: " + charcount);
    }
}
