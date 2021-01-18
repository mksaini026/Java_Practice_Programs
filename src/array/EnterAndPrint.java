package array;

import java.util.Scanner;

public class EnterAndPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array length");
        int[] arr = new int[sc.nextInt()];
        System.out.println("Enter " + arr.length + " elements of array");
        for (int e = 0; e < arr.length; e++) {
            arr[e] = sc.nextInt();
        }
        System.out.print("arr[] = {");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            } else {
                System.out.println("}");
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
    }
}
