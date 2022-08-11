import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        int number = input.nextInt();
        int tempNumber;
        int basValue = 0;
        while (number!=0) {
            tempNumber = number % 10;
            basValue += tempNumber;
            number /= 10;
        }

        System.out.println(basValue);
    }
}