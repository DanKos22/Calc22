package ie.atu;

import java.util.Scanner;

public class Calc
{
    public static void main(String[] args) {
        add();
        delete();
    }

    public static void add()
    {
        System.out.println("Please enter your first number: ");
        Scanner inputs = new Scanner(System.in);
        int firstNum = inputs.nextInt();

        System.out.println("Please enter the second number: ");
        int secondNum = inputs.nextInt();

        int total = firstNum + secondNum;
        System.out.println("The total is " + total);
    }

    public static void delete()
    {
        System.out.println("Please enter your first number: ");
        Scanner inputs = new Scanner(System.in);
        int firstNum = inputs.nextInt();

        System.out.println("Please enter the second number: ");
        int secondNum = inputs.nextInt();

        int subtraction = firstNum - secondNum;
        System.out.println("The result is " + subtraction);
    }
}
