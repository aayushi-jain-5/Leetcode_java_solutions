class Solution {
    public int bitwiseComplement(int n) {
        String bin = Integer.toBinaryString(n);
        String res = "";
        for(char c :bin.toCharArray()){
            if( c == '1')
                res += "0";
            else
                res += "1";
        }
        return Integer.parseInt(res, 2);
    }
}
