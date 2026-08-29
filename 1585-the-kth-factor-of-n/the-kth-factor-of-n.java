class Solution {
    public int kthFactor(int n, int k) {
        int a=0,b=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
               a++;
               if(a==k){
                b=i;
               }
            }
        }
        if(a<k){
            return -1;
        }
        else{
            return b;
        }
    }
}