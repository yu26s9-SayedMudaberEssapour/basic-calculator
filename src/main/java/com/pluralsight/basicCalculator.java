package com.pluralsight;
import java.util.Scanner;
import java.util.*;

public class basicCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //asking for the first number
        System.out.print("Enter your first Number: ");
        int firstNum = scanner.nextInt();



        //asking for the second number
        System.out.print("Enter your Second Number: ");
        int secondNum = scanner.nextInt();
        String a = scanner.nextLine();

        System.out.println("Possible calculations: \n (A)add \n (S)subtract \n (M)multiply \n (D)divide");


        String letter = scanner.nextLine();
        double answer = 0;
        String sign = "";

        if (letter.equalsIgnoreCase("A")) {
            answer = firstNum + secondNum;
            sign = "+";

        } else if (letter.equalsIgnoreCase("S")) {
            answer = firstNum - secondNum;
            sign = "-";

        } else if (letter.equalsIgnoreCase("M")) {
            answer = firstNum * secondNum;
            sign = "*";

        } else if (letter.equalsIgnoreCase("D")) {
            answer = firstNum / secondNum;
            sign = "/";
        } else {
            System.out.println("Not one of the options, Sorry!");

        }

        System.out.printf("your answer is: %d %s %d = %f" , firstNum, sign, secondNum,answer);


    }

}








