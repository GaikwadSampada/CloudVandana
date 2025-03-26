package AnagramCheckerCode;

import java.util.HashMap;
import java.util.Scanner;

public class AnagramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();
        
        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();
        
        boolean result = isAnagram(str1, str2);
        System.out.println("Output: " + result);
        
        scanner.close();
    }
    
    public static boolean isAnagram(String s1, String s2) {
        s1 = s1.replaceAll("\\s", "").toLowerCase();
        s2 = s2.replaceAll("\\s", "").toLowerCase();
        
        if (s1.length() != s2.length()) {
            return false;
        }
        
        HashMap<Character, Integer> charCount = new HashMap<>();
        
        for (char c : s1.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        
        for (char c : s2.toCharArray()) {
            if (!charCount.containsKey(c)) {
                return false;
            }
            charCount.put(c, charCount.get(c) - 1);
        }
        
        for (int count : charCount.values()) {
            if (count != 0) {
                return false;
            }
        }
        
        return true;
    }
}


//Input: "listen", "silent" 
//Output: true 
//Input: "hello", "world" 
//Output: false
