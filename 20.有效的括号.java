/*
 * @lc app=leetcode.cn id=20 lang=java
 *
 * [20] 有效的括号
 */

// @lc code=start
class Solution {
    public boolean isValid(String s){
        Set lefts = new HashSet();
        Stack stack = new Stack();
        char stackTop,chari;
        lefts.add('(');
        lefts.add('[');
        lefts.add('{');
        for(int i=0;i<s.length();i++){
            chari=s.charAt(i);
            if(lefts.contains(chari)){
                stack.push(chari);
            }else{
                if(stack.isEmpty()){
                    return false;
                }else{
                    stackTop=(char)stack.pop();
                    if(stackTop!=correctLeft(chari)){
                        return false;
                    }
                }
            }
        }
        if(stack.isEmpty()){
            return true;
        }
        return false;
    }

    static char correctLeft(char c){
        if(c==')'){
            return '(';
        }else if(c==']'){
            return '[';
        }else{
            return '{';
        }
    }
}
// @lc code=end

