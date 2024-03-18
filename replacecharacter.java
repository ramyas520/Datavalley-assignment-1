import java.util.Scanner;

public class ReplaceCharacterAtIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Original string: ");
        String originalString = scanner.nextLine();

        System.out.print("Enter the index of the character to replace: ");
        int index = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Enter the replacement(modified) character: ");
        char replacementChar = scanner.nextLine().charAt(0);

        String modifiedString = replaceCharAtIndex(originalString, index, replacementChar);
        System.out.println("Modified String: " + modifiedString);

        scanner.close();
    }

    public static String replaceCharAtIndex(String str, int index, char replacementChar) {
        if (index < 0 || index >= str.length()) {
            // Index out of range, return original string
            return str;
        }

        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.setCharAt(index, replacementChar);
        return stringBuilder.toString();
    }
}
