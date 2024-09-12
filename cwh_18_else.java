import java.util.Scanner;

public class cwh_18_else{
    public static void main(String[] args) {
        int age;
        System.out.println("Enter your age:");
        Scanner Sc = new Scanner(System.in);
        age = Sc.nextInt();
        if (age > 56) {
            System.out.println("You are experienced!");
        } else if (age > 46) {
            System.out.println("You are semi-experienced!");
        } else if (age > 36) {
            System.out.println("You are semi-semi experienced!");
        } else {
            System.out.println("You are not experienced!");

        }
        Sc.close();
    }
}