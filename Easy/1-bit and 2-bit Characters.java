class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int i =0;
        for (; i < bits.length - 1;) {
            if (bits[i] == 1) {
                i += 2;
            } else {
                i++;
            }
        }
        return i == bits.length - 1;
    }
}
