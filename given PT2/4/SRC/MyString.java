/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FPT
 */
public class MyString implements IString {
    @Override
    public int f1(String str) {
        String[] words = str.split("\\s+");
        int sum = 0;
        for (String word : words) {
            if (word.length() >= 2 && !isPalindrome(word)) {
                sum += word.length();
            }
        }
        return sum;
    }

    @Override
    public String f2(String str) {
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (sb.indexOf(String.valueOf(c)) == -1) {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    private boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i++) != str.charAt(j--)) {
                return false;
            }
        }
        return true;
    }
}
