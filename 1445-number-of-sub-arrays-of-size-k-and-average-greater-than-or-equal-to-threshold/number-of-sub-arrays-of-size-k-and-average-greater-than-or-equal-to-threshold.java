class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int current=0;
        int count=0;
        for(int i=0;i<k;i++){
            current+=arr[i];
        }
        int avg=current/k;
        if(avg>=threshold){
            count++;
        }
        for(int i=1;i<=arr.length-k;i++){
            current=current-arr[i-1]+arr[i+k-1];
            avg=current/k;
            if(avg>=threshold){
                count++;
            }
        }
        return count;
    }
}