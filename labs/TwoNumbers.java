
/*
Grant Hartley
Date: 2024/01/29
Desc: outputs larger of two numbers given user input to practice methods
*/

import java.util.Scanner;

/**
 * TwoNumbers
 */
public class TwoNumbers {

    public static void main(String[] args) {
        System.out.println("Please enter a number between 1 and 100.");
        int first = getInput();
        System.out.println("Please enter another number between 1 and 100.");
        int second = getInput();
        System.out.println("You entered the numbers " + first + " and " + second + ".");
        compare(first, second);

    }

    public static int getInput() {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        input.close();
        if (number < 1 || number > 100) {
            System.out.println("Invalid input. Please enter a number between 1 and 100.");
            number = getInput();
        }
        return number;
    }

    public static void compare(int first, int second) {

        if (first > second) {
            System.out.println("The larger number is " + first);
        } else if (first < second) {
            System.out.println("The larger number is " + second);
        } else {
            System.out.println("The numbers are equal.");
        }
    }
}
