import java.util.Scanner;

public class Exercise10 {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        int age;
        System.out.println("Please enter your age");
        age = input.nextInt();
        if (age >=16) {
            System.out.println("You are eligible to register to the website");
            System.out.println(" You can also register using the mobile app");
        }
            else
                System.out.println("Sorry, you are too young to register to the our website");
    }
}
