import java.util.Scanner;

public class Part2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your bloody name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("What is your gpa: ");
        double gpa = scanner.nextDouble();

        System.out.print("Are you a student, true/false: ");
        boolean isStudent = scanner.nextBoolean();


        if(isStudent){
            System.out.println("You're a student");
        }else{
            System.out.println("You're not a student ");
        }


        
        System.out.println("Hello Mr "+ name);
        System.out.println("You are "+ age+ " years old!");
        System.out.println("You gpa is "+ gpa);
        scanner.close();
    }

}
