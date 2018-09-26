import java.util.Scanner;

public class Q1 {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str1 = sc.nextLine();
        System.out.println("Enter string which will be replaced");

        String strx = sc.nextLine();
        System.out.println("Enter string which will take space in string");
        String str2 = sc.nextLine();
        System.out.println("String after replacement");
        System.out.println(str1.replace(strx, str2));
        System.out.println(str1.replaceAll(" ",""));


    }
}