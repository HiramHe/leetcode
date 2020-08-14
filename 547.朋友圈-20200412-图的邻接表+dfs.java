import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=547 lang=java
 *
 * [547] 朋友圈
 */

// @lc code=start
class Solution {
    public int findCircleNum(int[][] M) {
        if(M==null){
            return 0;
        }

        int[] visited=new int[M.length];
        Arrays.fill(visited, 0);
        int ans=0;

        for(int i=0;i<M.length;i++){
            if(visited[i]==0){
                dfs(M,visited,i);
                ans++;
            }
        }

        return ans;
    }

    public void dfs(int[][] M,int[] visited,int i){
        for(int j=0;j<M.length;j++){
            if(M[i][j]==1 && visited[j]==0){
                visited[j]=1;
                dfs(M,visited,j);
            }
        }
    }
}
// @lc code=end

