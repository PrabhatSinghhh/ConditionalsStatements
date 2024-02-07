package ConditionalStatements;

import java.util.Scanner;

public class AreaOfRectangleAndPerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length of Rectangle ");
        int l= sc.nextInt();
        System.out.println("Enter the the Breadth of Rectangle ");
        int b = sc.nextInt();
        if(l*b > 2*(l+b) ) System.out.println("area of rectangle is greater");

        if (2*(l+b)> l*b) System.out.println("perimeter of rectangular is greater");
    }
}
