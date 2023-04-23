import java.util.Scanner;

public class Task2 {
    //Write a program that reads two people's first
    //names and if they expecting boy or girl?
    //Based on the input suggests a name for a baby:
    //Example Output:
    //Mom’s first name? Mary
    //Dad’s first name? Daniel
    //Boy or Girl? boy
    //Suggested baby name: DANRY
    //
    //Example Output:
    //Mom’s first name? Mary
    //Dad’s first name? Daniel
    //Boy or Girl? girl
    //Suggested baby name: MAIEL
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Mom's first name?");
        String momName=scan.next();
        System.out.println("Dad's first name?");
        String dadName=scan.next();
        System.out.println("What is your wish for the baby gender?");
        String gender=scan.next();
        if (gender.equals("boy")){
            System.out.println("Suggested baby name is DANRY");
        }else{
            System.out.println("Suggested baby name is MAIEL");
        }
    }
}
