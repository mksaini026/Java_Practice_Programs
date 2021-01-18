package order;

public class DesOrder {
    static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    static void print(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] a = {23, 99, 19, 33, 13, 2};

        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    swap(a, i, j);
                }
            }
            //System.out.println(a[i]);
        }
        //System.out.println(a[a.length - 1]);
        print(a);
    }
}
