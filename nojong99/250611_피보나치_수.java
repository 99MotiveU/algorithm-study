class Solution {
    
    public int func(int n){
        
        if(n==0){
          return 0;  
        } 
        else if(n==1){
         return 1;   
        }
        int[] dp = new int[n+1];
        dp[0]=0;
        dp[1]=1;
        for(int i=2; i<=n; i++){
            dp[i]=dp[i-1] + dp[i-2];
            dp[i]%=1234567;
        }
        return dp[n];
    }
     
    public int solution(int n) {
        return func(n);
    }
    
}

