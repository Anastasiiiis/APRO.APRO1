public class Palindrome {

    public int length = 0;

    public static void main(String[] args) {
        String word = "abccba";
        String longestPalindrome = findLongestPalindrome(word);
        System.out.println(longestPalindrome);
    }

    public static String findLongestPalindrome(String word) {
        String result = "";
        for (int i = 0; i < word.length(); i++) {
            for (int j = word.length(); j > i; j--) {
                String wrd = analyzeSubstring(word.substring(i, j));
                if (result.isEmpty()) {
                    result = wrd;
                } else {
                    if (result.length() < wrd.length()) {
                        result = wrd;
                    }
                }
            }
        }
        return result;
    }

    public static String analyzeSubstring(String word) {
        if (!isPalindrome(word)) {
            System.out.println(word + " isn't a palindrome");
            return "";
        }
        System.out.println(word + " PALINDROME!!!");
        return word;
    }

    public static boolean isPalindrome(String word) {
        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
