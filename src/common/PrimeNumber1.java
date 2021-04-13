package common;

import java.util.Scanner;

public class PrimeNumber1 {
    public static void main(String[] args) {
        System.out.println("Enter the number to find whether prime or not :");
        int number = new Scanner(System.in).nextInt();

        if (number > 2 && number % 2 == 0) {
            System.out.println("given number "+ number + " is not a prime number");
        } else {
            System.out.println("given number "+ number + " is a prime number");
        }
    }
}
