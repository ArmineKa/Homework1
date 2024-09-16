import java.util.Random;
import java.util.Scanner;

public class Branching {
    public static void main(String[] args) {
        // Write a program that takes as an input three numbers and print "increasing" if the numbers are in increasing order,
        // "decreasing" if the numbers are in decreasing order, and "neither" otherwise (use conditional operators)

      Scanner scanner =new Scanner(System.in);
int a = scanner.nextInt() ;
int b = scanner.nextInt();
int c = scanner.nextInt();
 if(a < b && b < c){
     System.out.println("increasing");
 }else if (a > b && b > c){
     System.out.println("decreasing");
 } else System.out.println("neither");


        // Write a program that takes as an input an integer  representing the year  and determines whether it is a leap year.
        // A leap year  is exactly divisible by 4 except  for century years (years ending with 00).
        // A century year  is a leap year  only if it is perfectly divisible by 400.


        //Scanner scanner =new Scanner(System.in);
        int year = scanner.nextInt();
        if ((year % 4== 0 && year % 100 !=0 ) || ( year % 400 ==0)){
            System.out.println("Leap Year");
        }

// Write a program that takes as an input a character representing an operator and two integers.
// It performs a calculation based on the numbers and the operator entered(program should use switch statement)
       // Scanner scanner =new Scanner(System.in);
        String character = scanner.next();
        //int a = scanner.nextInt() ;
        //int b = scanner.nextInt();
        //int c = scanner.nextInt();
        int result;
        switch (character) {
            case "*":
                result = a * b;
                System.out.println(result);
                break;
            case ":":
                result = a % c;
                System.out.println(result);
                break;
            case "+":
                result = a+b;
                System.out.println(result);
                break;
            case "-":
                result = a-b;
                System.out.println(result);
                break;
            default:
                System.out.println("character is not an operator");

        }
        // Write a program that takes as an input the semester and the name of the program and outputs the required courses
        // based on the following table( program should use nested switch statements)


        String[] semesters = {"Fall", "Spring"};
        String semester = semesters[new Random().nextInt(semesters.length)];

        String[] coutses = {"CS", "ES"};
        String cours = coutses[new Random().nextInt(coutses.length)];
        String[] programs = {"Introduction to Computer Science", "OOP", "English Literature", "Introduction to Journalism"};

        System.out.println(semester + " " + cours);
        switch (semester) {
            case ("Fall"):
                switch (cours) {
                    case ("CS"):

                        String programFallCS = programs[0];
                        System.out.println("in fall CS's program is" + programFallCS);
                        break;
                    case ("ES"):
                        String programFallES = programs[2];
                        System.out.println("in fall ES's program is\" + programFallCS");
                        break;
                }
        }
    }
}
