package array;

public class AddTwoArray {
    public static void main(String[] args) {
        int[] a1 = new int[]{10, 20, 30, 40, 50};
        int[] a2 = new int[]{50, 40, 30, 20, 10};
        int[] a3 = new int[a1.length];
        for (int i = 0; i < a1.length; i++) {
            a3[i] = a1[i] + a2[i];
        }
        for (int a : a3) {
            System.out.println(a);
        }
    }
}
