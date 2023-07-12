class Solution {
    public boolean detectCapitalUse(String word) {
        int countUpper = 0;
        int countSmall=0;
        for(int i = 0;i<word.length();i++){
           if(Character.isUpperCase(word.charAt(i))){
               countUpper++;
           }else if(!Character.isUpperCase(word.charAt(i))) countSmall++;
        }
        if((countUpper==word.length()) || (countSmall==word.length()) || 
    (Character.isUpperCase(word.charAt(0))&& countSmall==word.length()-1)) return true;
    return false;
    }   
}
