import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get input strings
        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine().toLowerCase();
        
        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine().toLowerCase();
        
        // Check if they are anagrams
        boolean result = areAnagrams(str1, str2);
        
        // Display result
        System.out.println("Output: " + result);
        
        scanner.close();
    }
    
    public static boolean areAnagrams(String str1, String str2) {
        // Remove all whitespace and convert to character arrays
        char[] charArray1 = str1.replaceAll("\\s", "").toCharArray();
        char[] charArray2 = str2.replaceAll("\\s", "").toCharArray();
        
        // If lengths are different, they can't be anagrams
        if (charArray1.length != charArray2.length) {
            return false;
        }
        
        // Sort both character arrays
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        
        // Compare sorted arrays
        return Arrays.equals(charArray1, charArray2);
    }
}