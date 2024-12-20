import java.util.Scanner;

public class Exercise6 {
    public static void main(String[]args){
        int assignment_total = 40;
        int exam_total = 200;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your assignment grade ");
        int assignment_grade = scanner.nextInt();
        System.out.println("Please enter your exam grade");
        int exam_grade = scanner.nextInt();

        int final_grade = exam_grade + assignment_grade;
        System.out.println("Your final grade is: " + final_grade);
        int total = assignment_total + exam_total;
        double percentage = (double) assignment_grade/total *100;
        System.out.println("Your pecentage is: " + percentage);

    }
}
