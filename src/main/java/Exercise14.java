import java.util.Scanner;

public class Exercise14 {
    public static void main (String [] args){
int x = 10;
int y = 5;
        Scanner input = new Scanner(System.in);
        System.out.println(" Choose your options: 1 - add two numbers,2 - get the subtract of two numbers,3 - get the multiply of two numbers");
int option = input.nextInt();
    if ( option == 1)
        System.out.println("The addition is:" + (x+y));
        else if ( option == 2)
            System.out.println("The subtraction is:" + (x-y));
        else if ( option == 3)
            System.out.println("The multiplication is:" + (x*y));
        else
            System.out.println("Wrong choice");
        }
    }

