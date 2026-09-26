class Solution {
    public int heightChecker(int[] heights) {
        int[] ans=Arrays.copyOf(heights,heights.length);
        int count=0;
        Arrays.sort(ans);
        for(int i=0;i<ans.length;i++)
        {
            if(heights[i]!=ans[i]){
                count++;
            }
        }
        return count;
    }
}