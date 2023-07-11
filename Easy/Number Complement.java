class Solution {
    public int findComplement(int num) {
        String bin = Integer.toBinaryString(num);
        String res = "";
        for(char c :bin.toCharArray())
        {
            if( c == '1')
            res += "0";
            else
            res += "1";
        }
        return Integer.parseInt(res, 2);
    }
}
