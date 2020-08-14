import sun.net.www.content.audio.basic;
import sun.net.www.content.text.plain;

/*
 * @lc app=leetcode.cn id=5 lang=java
 *
 * [5] 最长回文子串
 */

// @lc code=start
class Solution {
    public String longestPalindrome(String s) {
        if(s==null)return null;
        int length=s.length();
        if(length==1)return s;
        
        String longestStr="";
        String palid1="";
        String palid2="";
        String temp="";
        for(int i=0;i<length-1;i++){
            palid1=palindrome(s, i, i);
            palid2=palindrome(s, i, i+1);
            temp=(palid1.length()>=palid2.length())?palid1:palid2;
            longestStr=(longestStr.length()>=temp.length())?longestStr:temp;
        }
        return longestStr;
    }

    static String palindrome(String s,int left,int right){
        int length=s.length();
        boolean flag=false;
        while(left>=0&&right<length){
            if(s.charAt(left)==s.charAt(right)){
                left--;
                right++;
                flag=true;
            }else{
                break;
            }
        }
        if(flag){
            return s.substring(left+1, right);
        }else{
            return s.substring(left, right);
        }
        
    }
}
// @lc code=end

