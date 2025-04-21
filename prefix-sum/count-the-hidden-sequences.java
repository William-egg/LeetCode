class Solution {
    public int numberOfArrays(int[] differences, int lower, int upper) {
        int cur = 0,left = 0,right = 0;
        for(int d:differences){
            cur += d;
            left = Math.min(left,cur);
            right = Math.max(right,cur);
            if(right - left>upper - lower) return 0;
        }
        return upper - (right - left)-lower+1;
    }
}