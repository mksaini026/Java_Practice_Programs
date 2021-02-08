package string;

public class ReverseString {
    public static void main(String[] args) {
        String s = "Manoj";
        System.out.println(s);

        StringBuilder sb = new StringBuilder(s);
        System.out.println(sb.reverse());

        for (int i = s.length()-1; i >= 0; i--) {
            System.out.print(s.charAt(i));
        }
    }
}
