class Solution {
    public int[] buildArray(int[] tab) {
    int[] ans=new int[tab.length];
       for(int i=0;i<tab.length;i++){
           ans[i]=tab[tab[i]];
       } 
       return ans ;
        
    }
}