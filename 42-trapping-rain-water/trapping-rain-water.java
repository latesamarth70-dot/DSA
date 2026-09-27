class Solution {
    public int trap(int[] height) {
        int ans=0;
        int l=0;
        int r=height.length-1;
        int lb=0;
        int rb=0;
        while(l<r){
            lb=Math.max(lb,height[l]);
            rb=Math.max(rb,height[r]);
            if(lb<rb){
                ans+=lb-height[l];
                l++;
            }
            else{
                ans+=rb-height[r];
                r--;
            }
        }
        return ans;
    }
}