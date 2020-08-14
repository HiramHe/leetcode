/*
 * @lc app=leetcode.cn id=912 lang=java
 *
 * [912] 排序数组
 */

// @lc code=start
class Solution {
    public int[] sortArray(int[] nums) {
        if(nums == null){
            return null;
        }

        this.quickSort(nums,0,nums.length-1);

        return nums;
    }

    private void quickSort(int[]nums,int left,int right){
        if(left >= right){
            return;
        }

        int point = this.partition(nums,left,right);

        //二重递归，有点类似于二叉树的遍历写法
        quickSort(nums,left,point-1);
        quickSort(nums,point+1,right);

    }

    private int partition(int[]nums,int left,int right){
        //随机指定一个标兵，将之与right位置的数交换
        int randomPivot = new Random().nextInt(right-left) + left;
        this.swap(nums,randomPivot,right);

        int slow = left;
        int fast = left;

        //slow将指向第一个大于标兵的数字
        //fast则一直在找小于标兵的数字，找到了，就让fast跟slow进行交换
        for(;fast<right;fast++){
            if(nums[fast]<=nums[right]){
                this.swap(nums,slow,fast);
                slow++;
            }
        }
        //最后，将标兵归位
        this.swap(nums,slow,right);

        //返回标兵最终的位置
        return slow;
    }

    private void swap(int[]nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
// @lc code=end

