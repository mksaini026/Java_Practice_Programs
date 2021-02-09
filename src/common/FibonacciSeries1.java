package common;

import java.util.Scanner;

public class FibonacciSeries1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of series");
        int no = sc.nextInt();
        int first = 1;
        int second = 1;
        if (no == 1) {
            System.out.print(first);
        } else if (no == 2) {
            System.out.print(first);
            System.out.print(", " + second);
        } else {
            System.out.print(first);
            System.out.print(", " + second);
            for (int i = 3; i <= no; i++) {
                int next = first + second;
                System.out.print(", " + next);
                first = second;
                second = next;
            }
        }
    }
}
