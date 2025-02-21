import java.util.Scanner;

public class palindromOrNot {
    public static void main(String[] args) {
        //A number whose reverse and forward digits are the same is called a palindrome...
        System.out.println("Please, input number...");
        int a = new Scanner(System.in).nextInt();
        int reserve = a;
        int remainder;
        int reverse = 0;
        while (a > 0) {
            remainder = a % 10;
            reverse = reverse * 10 + remainder;
            a = a / 10;
        }
        System.out.println(reverse);
        if (reserve == reverse) {
            System.out.println("Number is palindrome...");
        } else {
            System.out.println("Number is Not palindrome!!!");
        }
    }
}
