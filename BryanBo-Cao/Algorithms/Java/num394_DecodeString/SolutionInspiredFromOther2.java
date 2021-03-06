package num394_DecodeString;


public class SolutionInspiredFromOther2{
	
	int i = 0;
	
	public String decodeString(String s) {
		StringBuilder sb = new StringBuilder(s);
		return decodeString(sb);
	}
	
	private String decodeString(StringBuilder sb) {
		int n = 0;
		StringBuilder result = new StringBuilder();
		
		while (i < sb.length()) {
			if (Character.isDigit(sb.charAt(i))) {
				while (Character.isDigit(sb.charAt(i))) n = n * 10 + sb.charAt(i++) - '0';
				i++;	// '['
				String nested = decodeString(sb);
				
				while (n > 0) {
				    n--;
				    result.append(nested);
				}
				
			} else if (Character.isLetter(sb.charAt(i))) result.append(sb.charAt(i++));
			else if (sb.charAt(i++) == ']') return result.toString();
		}
		return result.toString();
	}
}
//https://leetcode.com/problems/decode-string/
/*
394. Decode String   Add to List QuestionEditorial Solution  My Submissions
Total Accepted: 15451
Total Submissions: 38907
Difficulty: Medium
Contributors: Admin
Given an encoded string, return it's decoded string.

The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being repeated exactly k times. Note that k is guaranteed to be a positive integer.

You may assume that the input string is always valid; No extra white spaces, square brackets are well-formed, etc.

Furthermore, you may assume that the original data does not contain any digits and that digits are only for those repeat numbers, k. For example, there won't be input like 3a or 2[4].

Examples:

s = "3[a]2[bc]", return "aaabcbc".
s = "3[a2[c]]", return "accaccacc".
s = "2[abc]3[cd]ef", return "abcabccdcdcdef".
Hide Company Tags Google
Hide Tags Depth-first Search Stack
Hide Similar Problems (H) Encode String with Shortest Length
*/
//from https://discuss.leetcode.com/topic/57228/0ms-simple-c-solution/4
//from https://discuss.leetcode.com/user/zhueason