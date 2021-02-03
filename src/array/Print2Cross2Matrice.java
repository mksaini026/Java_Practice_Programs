package array;

public class Print2Cross2Matrice {
    public static void main(String[] args) {
        int[][] a = new int[][]{{10, 20, 30}, {40, 50, 60}};
        System.out.println(a.length);
        for (int[] a1 : a) {
            System.out.println(a1.length);
            for (int a2 : a1) {
                System.out.println(a2);
            }
            System.out.println();
        }
    }
}
