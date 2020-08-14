/*
 * @lc app=leetcode.cn id=912 lang=java
 *
 * [912] 排序数组
 */

// @lc code=start
class Solution {
    public int[] sortArray(int[] nums) {

        if(nums == null || nums.length == 0){
            return nums;
        }

        build_heap(nums);

        heap_sort(nums);

        return nums;
        
    }

    //数组元素交换
    void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    //调整堆
    void heapify(int[] tree,int n,int i){

        if(i>=n){
            return;
        }

        int c1 = 2*i+1;
        int c2 = 2*i+2;

        int max = i;
        if(c1<n && tree[c1]>tree[max]){
            max = c1;
        }
        if(c2<n && tree[c2]>tree[max]){
            max = c2;
        }

        if(max != i){
            swap(tree,i,max);
            heapify(tree,n,max);
        }
        
    }

    //构造堆
    void build_heap(int[] tree){
        int lastNode = tree.length-1;
        int parent = (lastNode-1)/2;

        for(int i=parent;i>=0;i--){
            heapify(tree, tree.length, i);
        }
    }

    //堆排序
    void heap_sort(int[] heap){
        int length = heap.length;

        for(int i=length-1;i>=0;i--){
            swap(heap,0,i);
            heapify(heap,i,0);
        }
    }
}
// @lc code=end

