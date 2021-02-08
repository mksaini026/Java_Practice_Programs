package string;

public class ReplaceCharacterOfString {
    public static void main(String[] args) {

        String mobile = "9015150967";
        System.out.println(mobile.replace(mobile.substring(3,8), "*****"));

        String s = "J is a programming language. J is OOP language";
        System.out.println(s.replace("J", "Java"));

        String s1 = "J is a programming language. j is OOP language";
        System.out.println(s1.replace("J", "Java"));

        String s2 = "J is a programming language. j is OOP language";
        System.out.println(s2.replaceAll("[jJ]", "Java"));

    }
}
