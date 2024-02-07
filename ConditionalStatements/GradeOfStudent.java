package ConditionalStatements;

import java.util.Scanner;

public class GradeOfStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE MARKS ");
        int marks= sc.nextInt();
        //81-100 Very Good
        //61-80 Good
        //41-60 Average
        // <=40 Fail
        if(marks>=81 && marks<100) System.out.println("Very Good");
        else if (marks>=61 ) System.out.println("Good");
        else if (marks>=41 ) System.out.println("Average");
        else System.out.println("fail");




    }
}
