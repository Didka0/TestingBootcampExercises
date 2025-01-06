import java.util.Scanner;

public class Exercise11 {
    public static void main (String [] args){
        System.out.println("Please enter your salary");
        Scanner input = new Scanner(System.in);
        int salary = input.nextInt();
        if (salary > 0 && salary < 4000)
            System.out.println("Your salary will not have any reductions");
        else if (salary >=4000 && salary < 6000)
                System.out.println("You will get a tax of 10%");
        else if (salary >=6000)
            System.out.println("You will get a tax of 20%");
        else
            System.out.println("Invalid input");
    }
}
