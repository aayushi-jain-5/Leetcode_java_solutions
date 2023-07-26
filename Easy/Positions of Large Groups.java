class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        
        List<List<Integer>> res = new ArrayList<>();
        int n = s.length(), len = 1, prev = 0;
        
        for(int i=1;i<n;++i){
            if(s.charAt(i)== s.charAt(i-1))
                len++;
            else{
                if(len >=3)
                  res.add(List.of(prev,(i-1)));
                prev = i;
                len = 1;  
            }
        }
        if(len>=3)   res.add(List.of(prev,(n-1)));
         return res;
    }
}
