public class VowelCounter {

    public static int countVowels(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }

        int count = 0;
        String vowels = "aeiouAEIOU";

        for (int i = 0; i < str.length(); i++) {
            if (vowels.indexOf(str.charAt(i)) != -1) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String text = "Hello World";
        System.out.println("Vowel count: " + countVowels(text)); // Output: 3
    }
}
