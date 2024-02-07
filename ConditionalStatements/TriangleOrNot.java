package ConditionalStatements;

import java.util.Scanner;

public class TriangleOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st side");
        int a = sc.nextInt();
        System.out.print("Enter the 2nd side");
        int b = sc.nextInt();
        System.out.print("Enter the 3rd side");
        int c = sc.nextInt();
        if((a+b)>c && (b+c)>a &&(a+c)>b){
            System.out.println("it is triangle ");
        }else System.out.println("Invalid triangle ");
    }
}
