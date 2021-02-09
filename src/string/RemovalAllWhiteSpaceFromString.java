package string;

public class RemovalAllWhiteSpaceFromString {
    public static void main(String[] args) {
        String s = "Java is oop programming language";
        System.out.println(s.replaceAll(" ", ""));

        System.out.println(s.replaceAll("\\s", ""));

        String s1 = "     Java is oop programming language    ";
        System.out.println(s1.trim());
    }
}
