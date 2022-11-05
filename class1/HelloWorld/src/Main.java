import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("what is your name?");
        String answer = input.nextLine();
        System.out.println("My name is " + answer);
    }
}