import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        int age;
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("Plase Enter Your Name");
        name=sc.nextLine();
        System.out.println("Enter Your Age");
        age = sc.nextInt();
        System.out.println("Your Name is "+ name+ " and your age is "+age);
    }
    
}
