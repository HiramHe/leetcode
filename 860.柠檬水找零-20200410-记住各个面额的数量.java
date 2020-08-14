/*
 * @lc app=leetcode.cn id=860 lang=java
 *
 * [860] 柠檬水找零
 */

// @lc code=start
class Solution {
    public boolean lemonadeChange(int[] bills) {
        if(bills==null){
            return false;
        }

        int five_num=0,ten_num=0;

        for(int i=0;i<bills.length;i++){
            if(bills[i]==5){
                five_num++;
            }else if(bills[i]==10){
                if(five_num==0){
                    return false;
                }else{
                    five_num--;
                    ten_num++;
                }
            }else{
                if(ten_num>=1&&five_num>=1){
                    ten_num--;
                    five_num--;
                }else if(five_num>=3){
                    five_num-=3;
                }else{
                    return false;
                }
            }
        }

        return true;
    }
}
// @lc code=end

