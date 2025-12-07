package leetcode.problem58;
class Solution {
    public int lengthOfLastWord(String s) {
        String str[] = s.split(" ");
        int last = str.length-1;
        String lastString = str[last];
        return lastString.length();
    }
}
