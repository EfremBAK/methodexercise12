/*
problem
The letter grade is determined as follows:
A = 90–100%
B = 80–89%
C = 70–79%
D = 60–69%
F = 0–59%
Write a program that will print the letter grade based on the percentage entered.


psedocode
prompt user to enter score
get and store the number in score
use if condition to check if it is between a -f
display your answer



 */


import java.util.Scanner;

public class methodExerciseGrades {
    public static void main(String[] args) {

        boolean answer = true;
        Scanner q = new Scanner(System.in);

        while (answer) {

            double score;
            String answ;
            String methodOut = "";
            System.out.println("Please enter your score: ");
            score = q.nextDouble();
            if (score > 100)
                System.out.println("invalid entry");
            else if (score < 0)
                System.out.println("invalid entry");
            else

                methodOut = range(score);
            System.out.println(methodOut);
            System.out.println();
            System.out.println("Do you want to check another score? y/n");
            answ = q.next();
            if (answ.equalsIgnoreCase("n"))
                answer = false;
        }
    }

    // the method
    public static String range(double score) {
        String a1 = "Congrats, you got an A +", a2 = "Congrats, you got an A ", a3 = "Congrats, you got an A -";

        String b1 = "You got a B +", b2 = "You got a B", b3 = "You got a B -";
        String c1 = "You got a C +", c2 = "You got a C", c3 = "You got a C -";
        String d1 = "You got a D +", d2 = "You got a D", d3 = "You got a D -";
        String f = "Sorry, you got an F and you failed";

        if (score >= 97)
            return a1;
        else if (score > 94)
            return a2;
        else if (score > 90)
            return a3;
        else if (score >= 87)
            return b1;
        else if (score > 84)
            return b2;
        else if (score > 80)
            return b3;
        else if (score >= 77)
            return c1;
        else if (score > 74)
            return c2;
        else if (score > 70)
            return c3;
        else if (score >= 67)
            return d1;
        else if (score > 64)
            return d2;
        else if (score > 60)
            return d3;
        else
            return f;

    }

}
