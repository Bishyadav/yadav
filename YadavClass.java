import java.util.Scanner;

public class YadavClass {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Your Age ");
        int age=s.nextInt();
        if (age>=18){
            System.out.println("You are eligible for vote");
        }
        else {
            System.out.println("You are not eligible for vote");
        }
    }
}
