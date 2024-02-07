package ConditionalStatements;

import java.util.Scanner;

public class ThreeDigitNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        if(n>99 && n<1000){
            System.out.println(" it is three digit number ");
        }else System.out.println("Not a 3 digit number");
    }
}
