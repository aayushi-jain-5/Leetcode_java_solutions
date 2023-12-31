class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res=new ArrayList();
        StringBuilder build=new StringBuilder();
        build.append("(");
        helper(build,1,0,res,n);
        return res;
    }
    public void helper(StringBuilder build,int op,int cl,List<String> res,int n){
      if (build.length() == 2 * n) {
            res.add(build.toString());
            return;
        }

        if (op < n) {
            build.append("(");
            helper(build, op + 1, cl, res, n);
            build.deleteCharAt(build.length() - 1); 
        }

        if (cl < op) {
            build.append(")");
            helper(build, op, cl + 1, res, n);
            build.deleteCharAt(build.length() - 1); 
        }
    }
}
