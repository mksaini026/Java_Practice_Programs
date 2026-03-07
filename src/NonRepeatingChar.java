public class NonRepeatingChar {
    public static void main(String[] args) {
        String str = "aabbccddefg";
        Character result = findFirstNonRepeatingChar(str);
        if (result != null) {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }

    private static Character findFirstNonRepeatingChar(String input) {
        int[] freq = new int[256];
        for (char c : input.toCharArray()) {
            freq[c]++;
        }
        for (char c : input.toCharArray()) {
            if (freq[c] == 1) {
                return c;
            }
        }
        return null;
    }
}
