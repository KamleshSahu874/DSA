
import java.util.Scanner;

public class AbsoluteNo3 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            if (num >= 0) System.out.println("The absolute value of " + num + " is " + num);
            else System.out.println("The absolute value of " + num + " is " + (-num));
        }
    }
}
