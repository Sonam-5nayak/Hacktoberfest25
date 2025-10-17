class Solution {
    public int climbStairs(int n) {
        int memo[] = new int[n];
        return countSteps(n,0, memo);
    }
    int countSteps(int n, int steps, int memo[]){
    
        if (steps == n) return 1;
        if (steps > n) return 0; 
        if(memo[steps] != 0) return memo[steps];
        memo[steps] = countSteps(n,steps+1,memo) + countSteps(n,steps+2,memo);
        return memo[steps];
    }
}
