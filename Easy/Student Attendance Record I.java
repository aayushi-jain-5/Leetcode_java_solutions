class Solution {
    public boolean checkRecord(String s) {
        String str="";
        int cnt =0;
        int cnt1 = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='A')
            cnt++;
            if(s.charAt(i)=='L')
            cnt1++;
            else cnt1=0;
            if(cnt>=2 || cnt1>2) return false;
        }
        return true;
    }
}
