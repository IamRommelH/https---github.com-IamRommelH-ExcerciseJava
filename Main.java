import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Problem 1 – This problem involves evaluation of boolean expressions.
        // Assume the following declarations
        int a = 5;
        int b = 8;
        boolean c = true;
        boolean d = false;
        boolean result = false;

        // What do the following expressions evaluate to?
        // Answer: All of them returns true
        System.out.println("Problem 1");
        if (a < b && c){
            result = true;
        }
        System.out.println(result);
        if (a == b && c != d){
            result = true;
        }
        System.out.println(result);
        if (true || b != 7 && c){
            result = true;
        }
        System.out.println(result);
        if (!true || b != 7 && d){
            result = true;
        }
        System.out.println(result);
        if (!d && !c || true || b < a){
            result = true;
        }
        System.out.println(result);

        // Problem 2 – this deals with IF statements
        // What is wrong with the following code fragments? Rewrite them so that they produce the correct output.
        // Code fragment 1:
        // Answer: Curly braces is missing on the conditions where it cause syntax error and
        // the variables did not initially declared before it acutally used
        System.out.println("");
        System.out.println("Problem 2");
        int total = 0;
        int MAX = 0;
        int sum = 1;
        if(total == MAX){
            if (total < sum){
                System.out.println("total == MAX and total < sum");
            }else{
                System.out.println("total is not equal to MAX");
            }
        }

        // Code fragment 2
        // Answer: Curly braces is missing on the conditions where it cause syntax error and
        // the variables did not initially declared before it acutally used
        boolean length = true;
        boolean MIN_LENGTH = true;
        if (length = MIN_LENGTH){
            System.out.println("The length is minimal.");
        }

        // Problem 3 – this deals with constructing complicated Boolean expresions and using logical
        // Operators
        // Write a Java method to determine whether a year provided as the parameter value is a leap year.
        // If it is, return true, otherwise return false.
        // A year is a leap year if
        // • It is a multiple of 4 but not a multiple of 100
        // OR
        // • It is a multiple of 400
        // So, for example, 1996 and 2000 are leap years, but 1900, 2002 and 2100 are not
        System.out.println("");
        System.out.println("Problem 3");
        int year;
        System.out.println("Enter an Year :: ");
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();

        if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0)){
            System.out.println("Leap year!");
        }else{
            System.out.println("Not a leap year!");
        }

        // Problem 4 – this problem requires the use of the switch statement
        // Write a program which asks the user to enter a number between 1 and 7 inclusive. In response it
        // will print the name of the day of the week corresponding to the following scheme: 1 = Monday, 2
        // = Tuesday and so on. Any other input should result in a graceful error message to the user. Use
        // Switch, rather than IF to complete this task.
        System.out.println("");
        System.out.println("Problem 4");
        int day;
        System.out.println("Enter a number between 1 and 7 inclusive:");
        day = sc.nextInt();
        switch (day) {
        case 1:
            System.out.println("Monday");
            break;
        case 2:
            System.out.println("Tuesday");
            break;
        case 3:
            System.out.println("Wednesday");
            break;
        case 4:
            System.out.println("Thursday");
            break;
        case 5:
            System.out.println("Friday");
            break;
        case 6:
            System.out.println("Saturday");
            break;
        case 7:
            System.out.println("Sunday");
            break;
        }

        // Problem 5 – this problem requires the use of the switch statement
        // Write a program which asks the user to enter a number between 1 and 12, corresponding to the
        // months of the year, and display the name of the corresponding month.
        System.out.println("");
        System.out.println("Problem 5");
        int month;
        System.out.println("Enter a number between 1 and 12:");
        month = sc.nextInt();
        switch (month) {
        case 1:
            System.out.println("January");
            break;
        case 2:
            System.out.println("February");
            break;
        case 3:
            System.out.println("March");
            break;
        case 4:
            System.out.println("April");
            break;
        case 5:
            System.out.println("May");
            break;
        case 6:
            System.out.println("June");
            break;
        case 7:
            System.out.println("July");
            break;
        case 8:
            System.out.println("August");
            break;
        case 9:
            System.out.println("September");
            break;
        case 10:
            System.out.println("October");
            break;
        case 11:
            System.out.println("November");
            break;
        case 12:
            System.out.println("December");
            break;
        }

        // Problem 6 – this problem requires the use of a for loop
        // [adapted from Liang, p. 168]
        // Assume the price of a year’s worth of study for a degree is currently $7000, and is increasing by
        // an amount of 3% per year. Write a program that will calculate and report the cost of one year’s
        // worth of study in the year 2024
        System.out.println("");
        System.out.println("Problem 6");
        double degree_cost = 7000.00;
        for (int i = 2022; i < 2025; i++) {
            degree_cost = degree_cost + (degree_cost * 0.03);
            System.out.println("Year " + i + ": " +  Double.toString(degree_cost));
        }

        // Problem 7 – this problem requires the use of a while loop as well as IF statements.
        // [adapted from Liang, p. 168]
        // Write a program that repeatedly asks for the name and final course score out of 100, of students
        // who studied for a course. Ask for the score before the name. The program will stop when the
        // score of -1 is entered. At this point it should report the name and score of the highest scoring
        // students.
        System.out.println("");
        System.out.println("Problem 7");
        int score;
        String name;
        while (true) {
            System.out.println("Enter the score of student between -1 and 100:");
            score = sc.nextInt();
            if(score == -1){
                System.out.println("Enter the name of student");
                Scanner scx = new Scanner(System.in);
                name = scx.nextLine();
                System.out.println(name + " 100");
                break;
            }
        }
    }
  }