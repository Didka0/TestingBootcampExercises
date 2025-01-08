import java.util.Scanner;

public class Exercise13 {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        System.out.println("Please enter a value between 1 & 4:");
        int grade = input.nextInt();
        switch(grade){
            case 1:
                System.out.println("The value is one");
                break;
            case 2:
                System.out.println("The value is two");
                break;
            case 3:
                System.out.println("The value is three");
                break;
            case 4:
                System.out.println("The value is four");
                break;
        }
    }
}
