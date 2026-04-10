package com.pluralsight;
import java.util.Scanner;
import java.util.*;

public class basicCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //this should get the first number
        int firstNumber = getFirstNum(scanner);

        //asking for the second number
        int seconfNumber = getSecondNum(scanner);


        System.out.println("Possible calculations: \n (A)add \n (S)subtract \n (M)multiply \n (D)divide");


        String letter = scanner.nextLine();
        double answer = 0;
        String sign = "";

        if (letter.equalsIgnoreCase("A")) {
            answer = firstNumber + seconfNumber;
            sign = "+";

        } else if (letter.equalsIgnoreCase("S")) {
            answer = firstNumber - seconfNumber;
            sign = "-";

        } else if (letter.equalsIgnoreCase("M")) {
            answer = firstNumber * seconfNumber;
            sign = "*";

        } else if (letter.equalsIgnoreCase("D")) {
            answer = firstNumber / seconfNumber;
            sign = "/";
        } else {
            System.out.println("Not one of the options, Sorry!");

        }

        System.out.printf("your answer is: %d %s %d = %f", firstNumber, sign, seconfNumber, answer);


    }

    public static int getFirstNum(Scanner scanner) {
        //asking for the first number
        System.out.print("Enter your first Number: ");
        int firstNum = scanner.nextInt();
        return firstNum;
    }

    public static int getSecondNum(Scanner scanner)
    {
        System.out.print("Enter your Second Number: ");
        int secondNum = scanner.nextInt();
        String a = scanner.nextLine();
        return secondNum;
    }



}








