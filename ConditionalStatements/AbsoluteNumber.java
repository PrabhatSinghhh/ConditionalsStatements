package ConditionalStatements;

import java.util.Scanner;

public class AbsoluteNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = sc.nextInt();
        if (num<0){
            System.out.println(-num);
        }
        else {
            System.out.println(num);
        }
    }
}
