class Solution {
    public int[] runningSum(int[] tab) {
        int n= tab.length;
       int[] runningSum=new int[n];
       int sum=0;
       for(int i=0;i<n;i++){
           sum=sum+tab[i];
           runningSum[i]=sum;
       }
       return runningSum ;
        
    }
}