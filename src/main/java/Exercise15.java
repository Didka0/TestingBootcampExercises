import java.util.Scanner;

public class Exercise15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");
        int x = input.nextInt();
        System.out.println("Enter second number");
        int y = input.nextInt();
        System.out.println("Choose you action: 1 - add,2 - subtract,3 - multiply");
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                System.out.println("The addition is:" + (x + y));
                break;
            case 2:
                System.out.println("The subtraction is:" + (x - y));
                break;
            case 3:
                System.out.println("The multiplication is:" + (x * y));
                break;
            default:
            System.out.println("Wrong choice");
        }
    }
}
