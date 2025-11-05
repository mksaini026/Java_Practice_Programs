package string;

public class MergeStringsAlternately {

    public static String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder(Math.max(word1.length(), word2.length()) * 2);
        int i = 0, j = 0;
        while (i < word1.length() && j < word2.length()) {
            sb.append(word1.charAt(i++));
            sb.append(word2.charAt(j++));
        }
        if (i < word1.length()) sb.append(word1.substring(i));
        if (j < word2.length()) sb.append(word2.substring(j));
        return sb.toString();
    }

    public static String mergeAlternately1(String word1, String word2) {
        StringBuilder result = new StringBuilder(word1.length() + word2.length());
        int i = 0;
        while (i < word1.length() || i < word2.length()) {
            if (i < word1.length()) {
                result.append(word1.charAt(i));
            }
            if (i < word2.length()) {
                result.append(word2.charAt(i));
            }
            i++;
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(mergeAlternately("abc", "pqr")); // apbqcr
        System.out.println(mergeAlternately("ab", "pqrs")); // apbqrs
        System.out.println(mergeAlternately("abcd", "pq")); // apbqcd

        System.out.println("-----");

        System.out.println(mergeAlternately1("abc", "pqr")); // apbqcr
        System.out.println(mergeAlternately1("ab", "pqrs")); // apbqrs
        System.out.println(mergeAlternately1("abcd", "pq")); // apbqcd
    }

}
