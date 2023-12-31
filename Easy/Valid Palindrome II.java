class Solution {
    public boolean validPalindrome(String s) {
        
        int i=0, j = s.length()-1;
        while(i<j){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }

            //call recursion with i+1, and j-1
            //it skips the character and again checks for palindrome

            else return validPalindromeTill(s, i+1, j) || validPalindromeTill(s, i, j-1);
        }
        return true;
    }
    public boolean validPalindromeTill(String s, int i, int j){
        while(i<j){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
