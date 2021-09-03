/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Gabriel Martin
 */

/*
 * create Scanner to get user input
 * prompt for first number and store in 'input1'
 * prompt for second number and store in 'input2'
 * create int 'num1' = Integer.parseInt(input1) (change string to int)
 * create int 'num2' = Integer.parseInt(input2)
 * add = num1 + num2
 * sub = num1 - num2
 * mul = num1 * num2
 * div = num1 / num2
 * print num1 and num2 with each operation associated and \n between each
 */

import java.util.Scanner;

public class Solution05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the first number? ");
        String input1 = input.nextLine();

        System.out.print("What is the second number? ");
        String input2 = input.nextLine();

        int num1 = Integer.parseInt(input1);
        int num2 = Integer.parseInt(input2);

        int add, sub, mul, div;
        add = num1 + num2;
        sub = num1 - num2;
        mul = num1 * num2;
        div = num1 / num2;

        System.out.println(num1 + " + " + num2 + " = " + add + "\n" + num1 + " - " + num2 + " = " + sub + "\n" + num1 + " * " + num2 + " = " + mul + "\n" + num1 + " / " + num2 + " = " + div + "\n");
    }
}
