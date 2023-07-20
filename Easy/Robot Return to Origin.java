class Solution {
    public boolean judgeCircle(String moves) {
        int up=0;int down=0;
        int left=0;int right=0;
        
        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i)=='U'){
                up++;
            }
            else if(moves.charAt(i)=='D'){
                down++;
            }
            else if(moves.charAt(i)=='L'){
                left++;
            }
            else if(moves.charAt(i)=='R'){
                right++;
            }
        }
        if(left==0 && right==0){
            if(up==down){
                return true;
            }
            return false;
        }
        if(up==0 && down==0){
            if(left==right){
                return true;
            }
            return false;
        }
        if(up==down && left==right){
            return true;
        }
        return false;
    }
}
