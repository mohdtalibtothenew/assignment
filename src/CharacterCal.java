

import java.util.Scanner;

public class CharacterCal {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String");
        String str1 = sc.nextLine();
        int str1Length = str1.length();
        String str2=str1.replaceAll(" ","");

        int lowerCaseLettersCount =  str2.replaceAll("[^a-z]", "").length();
        int upperCaseLettersCount = str2.replaceAll("[^A-Z]", "").length();
        int digitCount =  str2.replaceAll("[^0-9]", "").length();
        int specialCharCount = str2.replaceAll("[A-Za-z0-9]", "").length();
        double upperCasePercentage = upperCaseLettersCount*100/str1Length;
        double lowerCasePercentage = lowerCaseLettersCount*100/str1Length;
        double digitPercentage = digitCount*100/str1Length;
        double specialCharPercentage = specialCharCount*100/str1Length;
        System.out.println("Upper case Letters count "+upperCaseLettersCount+ " and Percentage "+upperCasePercentage);
        System.out.println("Lower case Letters count "+lowerCaseLettersCount+ " and Percentage "+lowerCasePercentage);
        System.out.println("Digits count "+digitCount+ " and Percentage "+digitPercentage);
        System.out.println("Special character count "+specialCharCount+ " and Percentage "+specialCharPercentage);


    }



}
