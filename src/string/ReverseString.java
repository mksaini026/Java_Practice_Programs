package string;

public class ReverseString {
    public static void main(String[] args) {
        String s = "Manoj";
        System.out.println(s);

        StringBuilder sb = new StringBuilder(s);
        System.out.println(sb.reverse());

        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.print(s.charAt(i));
        }

        System.out.println();

        StringBuilder stringBuilder = new StringBuilder("Reverse");
        int length = stringBuilder.length();
        for (int i = 0; i < length / 2; i++) {
            char currentChar = stringBuilder.charAt(i);
            int otherEnd = length - i - 1;
            stringBuilder.setCharAt(i, stringBuilder.charAt(otherEnd));
            stringBuilder.setCharAt(otherEnd, currentChar);
        }
        System.out.println(stringBuilder.toString());
    }
}
