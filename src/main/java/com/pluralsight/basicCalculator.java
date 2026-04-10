package com.pluralsight;
import java.util.Scanner;

public class basicCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter your first Number: ");
        int firstNum = scanner.nextInt();


        System.out.print("Enter your Second Number: ");
        int secondNum = scanner.nextInt();
        String a = scanner.nextLine();

        System.out.println("Possible calculations: \n (A)add \n (S)subtract \n (M)multiply \n (D)divide");


        char letter = scanner.next().charAt(0);
        int answer = 0;

        if (letter == ('A')) {
            answer = firstNum + secondNum;
        } else if (letter == ('S')) {
            answer = firstNum - secondNum;
        } else if (letter == ('M')) {
            answer = firstNum * secondNum;
        } else if (letter == ('D')) {
            answer = firstNum / secondNum;
        } else {
            System.out.println("Not one of the options, Sorry!");
        }

        System.out.println("Your answer is: " + answer);
    }

}








