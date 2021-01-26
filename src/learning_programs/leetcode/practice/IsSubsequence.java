package learning_programs.leetcode.practice;

/*
 * 
 * Given a string s and a string t, check if s is subsequence of t.
 * 
 * Example 
	Input: s = "abc", t = "ahbgdc"
	Output: true
 * 
 * 
 */
import java.util.Scanner;

public class IsSubsequence {

	 public static boolean isSubsequence(String s, String t) {
	       if(s.length() ==0 || s == null) {
	           return true;
	       }
	        int str1 = 0, str2 =0;
	        while(str1 < s.length() && str2 <t.length()) {
	            if(s.charAt(str1) == t.charAt(str2)) {
	                str1++;
	            }
	            str2++;
	        }
	        return str1 == s.length();
	    }
	 
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String t = sc.nextLine();
		System.out.println(isSubsequence(s,t));
	}

}
