class Solution {
    public int maximumWealth(int[][] myNumbers ) {
         int Max=0;
        for (int i = 0; i < myNumbers.length; ++i) {
            int sum=0;
            for (int j = 0; j < myNumbers[i].length; ++j) {
                sum=sum + myNumbers[i][j];
                if(sum>Max) {
                    Max = sum;
                }

            }
        }
        return Max ;
      

        
    }
}