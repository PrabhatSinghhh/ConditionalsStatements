package ConditionalStatements;

import java.util.Scanner;

public class FiveDigitNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number ");
        int n = sc.nextInt();
        if(n>9999 && n<100000) System.out.println("it is a 5 digit number ");
        else System.out.println("Not a 5 digit number ");

    }
}
