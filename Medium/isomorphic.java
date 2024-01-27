import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class IsomorphicKeyboardLayout {

    public static boolean areIsomorphic(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        Map<Character, Character> mapping = new HashMap<>();

        for (int i = 0; i < str1.length(); i++) {
            char char1 = str1.charAt(i);
            char char2 = str2.charAt(i);

            if (mapping.containsKey(char1)) {
                if (mapping.get(char1) != char2) {
                    return false;  // Inconsistent mapping
                }
            } else {
                if (mapping.containsValue(char2)) {
                    return false;  // Two keys map to the same character
                }

                mapping.put(char1, char2);
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first keyboard layout string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter the second keyboard layout string: ");
        String str2 = scanner.nextLine();

        boolean result = areIsomorphic(str1, str2);

        if (result) {
            System.out.println("The keyboard layouts are isomorphic.");
        } else {
            System.out.println("The keyboard layouts are not isomorphic.");
        }

        scanner.close();
    }
}
