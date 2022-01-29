import java.util.Scanner;


public class simp_calci 
{

    public static void main(String[] args) 
    {
        int num1;
        int num2;
        String operation;


        Scanner input = new Scanner(System.in);

        System.out.println("Enter First Number");
        num1 = input.nextInt();

        System.out.println(" Enter Second Number");
        num2 = input.nextInt();

        Scanner op = new Scanner(System.in);

        System.out.println(" Enter operation");
        operation = op.next();

        if (operation == "+");
        {
            System.out.println(" Answer is\n" + (num1 + num2));
        }
        if  (operation == "-");
        {
            System.out.println("Answer is\n" + (num1 - num2));
        }

        if (operation == "/");
        {
            System.out.println("Answer is" + (num1 / num2));
        }
        if (operation == "*")
        {
            System.out.println("Answer is" + (num1 * num2));
        }


    }
}