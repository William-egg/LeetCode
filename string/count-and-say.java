class Solution {
    public String countAndSay(int n) {
        if(n == 1) return "1";
        char[] next = countAndSay(n-1).toCharArray();
        StringBuffer sb = new StringBuffer();
        int i = 0;
        while(i<next.length){
            int count = 1;
            while(i+1<next.length && next[i] == next[i+1]){
                count++;
                i++;
            }
            sb.append(count+""+next[i++]);
        }
        return sb.toString();
    }
}