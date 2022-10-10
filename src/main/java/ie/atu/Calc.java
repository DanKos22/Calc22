package ie.atu;

import java.util.Scanner;

public class Calc
{

    public static void main(String[] args) {
        add();
        delete();
        multiply();
    }

    // Add two numbers
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

    // Subtract two numbers
    public static void delete()
    {
        System.out.println("Please enter your third number: ");
        Scanner inputs = new Scanner(System.in);
        int firstNumber = inputs.nextInt();

        System.out.println("Please enter the fourth number: ");
        int secondNumber = inputs.nextInt();

        int delete = firstNumber - secondNumber;
        System.out.println("The subtraction is " + delete);
    }


    // Multiply two numbers
    public static void multiply()
    {
        System.out.println("Please enter your fifth number: ");
        Scanner inputs = new Scanner(System.in);
        int oneNum = inputs.nextInt();

        System.out.println("Please enter the sixth number: ");
        int twoNum = inputs.nextInt();
        int multiple = oneNum * twoNum;
        System.out.println("The multiple is " + multiple);
    }
}
