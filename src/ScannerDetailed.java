import java.util.Scanner;

public class ScannerDetailed {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = input.next();
        System.out.println("Enter your surname:");
        String surname = input.next();
        System.out.println("How old are you?");
        int age = input.nextInt();
        System.out.printf("Full info: \n%s %s\n%s years old", surname, name, age);
        final int adult;
        adult = 18;
        if (age >= adult) {
            System.out.println("\nYou are old enough to party!");
        } else {
            System.out.println("\nA bright future is ahead!");
        }
    }
}