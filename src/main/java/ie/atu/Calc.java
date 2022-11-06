package ie.atu;

import java.util.Scanner;

public class Calc
{

    public static void main(String[] args) {
        System.out.println("Please enter your first number: ");
        Scanner inputs = new Scanner(System.in);
        int firstNum = inputs.nextInt();

        System.out.println("\nPlease enter your second number: ");
        int secondNum = inputs.nextInt();
        add(firstNum, secondNum);
        delete(firstNum, secondNum);
        multiply(firstNum, secondNum);
    }

    // Add two numbers
    public static void add(int firstNum, int secondNum)
    {
        int total = firstNum + secondNum;
        System.out.println("\nThe total is " + total);
    }

    // Subtract two numbers
    public static void delete(int firstNum, int secondNum)
    {
        System.out.println();
        int delete = firstNum - secondNum;
        System.out.println("\nThe subtraction is " + delete);
    }


    // Multiply two numbers
    public static void multiply(int firstNum, int secondNum)
    {
        int multiple = firstNum * secondNum;
        System.out.println("\nThe multiple is " + multiple);
    }
}
