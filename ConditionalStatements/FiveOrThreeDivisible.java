package ConditionalStatements;

import java.util.Scanner;

public class FiveOrThreeDivisible {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number ");
        int num = sc.nextInt();
        if(num%3 == 0 || num%5  ==0) {
            System.out.println("Number is Divisible by 3and5");
        }
        else System.out.println("Not divisible by 3 and 5");
    }
}
