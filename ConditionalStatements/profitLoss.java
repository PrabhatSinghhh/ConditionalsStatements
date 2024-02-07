package ConditionalStatements;

import java.util.Scanner;

public class profitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cp ");
        int cp = sc.nextInt();
        System.out.println("Enter the sp ");
        int sp = sc.nextInt();
        if (sp > cp) System.out.println("Profit of Rs "+ (sp - cp));

        if (cp > sp) System.out.println("Loss of RS "+ (cp - sp));

        if (cp == sp) System.out.println("No Profit No Loss ");

    }
}
