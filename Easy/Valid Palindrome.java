class Solution {
    public boolean isPalindrome(String s) {
        String s1="";
        boolean b=false;
        s=s.toLowerCase();
        s= s.replace(" ",""); 
        s= s.replaceAll("\\p{Punct}", "");
        for(int i=s.length()-1;i>=0;i--){
            s1=s1+s.charAt(i);
        }
        if(s.equals(s1)){
          b=true;
        }
        else
        b=false;
        return b;
    }
}
