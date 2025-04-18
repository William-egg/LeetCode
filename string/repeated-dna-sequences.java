class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> res = new HashSet<>();
        int n = s.length();
        Set<String> middle = new HashSet<>();
        for(int i = 0;i+9<n;i++){
            String tmp = s.substring(i,i+10);
            if(middle.contains(tmp)&&!res.contains(tmp)){
                res.add(tmp);
            }
            else{
                middle.add(tmp);
            }
        }
        return new ArrayList(res);
    }
}